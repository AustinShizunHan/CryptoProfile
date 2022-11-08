package au.edu.unsw.infs3634.cryptoprofile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import au.edu.unsw.infs3634.cryptoprofile.api.Coin;
import au.edu.unsw.infs3634.cryptoprofile.api.CoinLoreResponse;
import au.edu.unsw.infs3634.cryptoprofile.api.RetrofitService;
import au.edu.unsw.infs3634.cryptoprofile.DB.CoinDatabase;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    private RecyclerViewAdapter mAdapter;
    private CoinDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("INFS3634 CryptoProfile");

        RecyclerView mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        RecyclerViewAdapter.RecyclerViewClickListener listener = (view, coinSymbolMessage) -> launchDetailActivity(coinSymbolMessage);

        mAdapter = new RecyclerViewAdapter(new ArrayList<>(), listener);
        mRecyclerView.setAdapter(mAdapter);

        // Initialise the database
        mDb = Room.databaseBuilder(getApplicationContext(), CoinDatabase.class, "coin-database")
                .build();
        // Create an asynchronous database call using Java Runnable to
        // get the list of coins from the database
        // Set the adapter using the result
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                ArrayList<Coin> coins = (ArrayList<Coin>) mDb.coinDao().getCoins();
                mAdapter.setData(coins);
                mAdapter.sort(RecyclerViewAdapter.sortingMethodName);
            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinlore.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<CoinLoreResponse> responseCall = service.getResponse();
        responseCall.enqueue(new Callback<CoinLoreResponse>() {
            @Override
            public void onResponse(Call<CoinLoreResponse> call, Response<CoinLoreResponse> response) {
                Log.d("Main", "API call successful!");
                assert response.body() != null;
                List<Coin> coins = response.body().getData();
                Executors.newSingleThreadExecutor().execute(new Runnable() {
                    @Override
                    public void run() {
                        // Delete all rows currently in your coins entity in the Database
                        mDb.coinDao().deleteCoins(mDb.coinDao().getCoins().toArray(new Coin[0]));
                        // Add all rows from the List<Coin> you created from the HTTP request to the Database
                        mDb.coinDao().insertCoins(coins.toArray(new Coin[0]));
                    }
                });

                mAdapter.setData((ArrayList)coins);
                mAdapter.sort(RecyclerViewAdapter.sortingMethodName);

                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<CoinLoreResponse> call, Throwable t) {
                Log.d("MainActivity", "API call failure.");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.app_bar_search).getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String searchQuery) {
                mAdapter.getFilter().filter(searchQuery);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newQuery) {
                mAdapter.getFilter().filter(newQuery);
                return false;
            }
        });
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sortName:
                mAdapter.sort(RecyclerViewAdapter.sortingMethodName);
                return true;
            case R.id.sortValue:
                mAdapter.sort(RecyclerViewAdapter.sortingMethodValue);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void launchDetailActivity(String message){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.INTENT_MESSAGE, message);
        startActivity(intent);
    }
}
package au.edu.unsw.infs3634.cryptoprofile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import au.edu.unsw.infs3634.cryptoprofile.api.Coin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("INFS3634 CryptoProfile");

        RecyclerView mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        RecyclerViewAdapter.RecyclerViewClickListener listener = (view, coinSymbol) -> launchDetailActivity(coinSymbol);

        mAdapter = new RecyclerViewAdapter(Coin.getCoins(), listener);
        mAdapter.sort(RecyclerViewAdapter.sortingMethodName);
        mRecyclerView.setAdapter(mAdapter);
    }


    @Override
    //
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
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
            case R.id.tvSortName:
                mAdapter.sort(RecyclerViewAdapter.sortingMethodName);
                return true;
            case R.id.tvSortValue:
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




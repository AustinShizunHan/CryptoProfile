package au.edu.unsw.infs3634.cryptoprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import com.bumptech.glide.Glide;
import au.edu.unsw.infs3634.cryptoprofile.api.Coin;
import au.edu.unsw.infs3634.cryptoprofile.DB.CoinDatabase;

import android.util.Log;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.widget.TextView;
import android.widget.ImageView;

import java.text.NumberFormat;
import java.util.concurrent.Executors;

public class DetailActivity extends AppCompatActivity {
    public static final String INTENT_MESSAGE = "intent_message";
    private static final String TAG = "DetailActivity";
    private CoinDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView coinName = findViewById(R.id.tvName);
        TextView coinSymbol = findViewById(R.id.tvSymbol);
        TextView coinValue = findViewById(R.id.tvValueField);
        TextView coin1hChange = findViewById(R.id.tvChange1hField);
        TextView coin24hChange = findViewById(R.id.tvChange24hField);
        TextView coin7dChange = findViewById(R.id.tvChange7dField);
        TextView coinMarketCap = findViewById(R.id.tvMarketcapField);
        TextView coinVolume = findViewById(R.id.tvVolumeField);
        ImageView coinSearch = findViewById(R.id.ivSearch);
        ImageView coinArt = findViewById(R.id.ivImage);


        Intent intent = getIntent();
        if (intent.hasExtra(INTENT_MESSAGE)) {
            String coinSymbolMessage = intent.getStringExtra(INTENT_MESSAGE);
            Log.d(TAG, "INTENT_MESSAGE = " + coinSymbolMessage);

            // Create a CoinDatabase Object
            mDb = Room.databaseBuilder(getApplicationContext(), CoinDatabase.class, "coin-database")
                    .build();
            Executors.newSingleThreadExecutor().execute(() -> {
                Coin coin = mDb.coinDao().getCoin(coinSymbolMessage);
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                runOnUiThread(() -> {
                    setTitle(coin.getName());
                    coinName.setText(coin.getName());
                    coinSymbol.setText(coin.getSymbol());
                    coinValue.setText(formatter.format(Double.valueOf(coin.getPriceUsd())));

                    String percentChange1h = coin.getPercentChange1h() + " %";
                    String percentChange24h = coin.getPercentChange24h() + " %";
                    String percentChange7d = coin.getPercentChange7d() + " %";

                    coin1hChange.setText(percentChange1h);
                    coin24hChange.setText(percentChange24h);
                    coin7dChange.setText(percentChange7d);
                    coinMarketCap.setText(formatter.format(Double.valueOf(coin.getMarketCapUsd())));
                    coinVolume.setText(formatter.format(coin.getVolume24()));
                    Glide.with(DetailActivity.this)
                            .load("https://www.coinlore.com/img/" + coin.getNameid() + ".png")
                            .fitCenter()
                            .into(coinArt);

                    coinSearch.setOnClickListener(v -> searchCoin(coin.getName()));
                });
            });
        }
    }

    private void searchCoin(String name) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + name));
        startActivity(intent);
    }

}
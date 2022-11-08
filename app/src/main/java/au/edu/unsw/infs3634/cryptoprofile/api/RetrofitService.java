package au.edu.unsw.infs3634.cryptoprofile.api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("api/tickers")
    Call<CoinLoreResponse> getResponse();
}
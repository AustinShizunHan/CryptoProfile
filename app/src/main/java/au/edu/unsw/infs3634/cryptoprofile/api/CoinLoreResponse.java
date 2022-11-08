package au.edu.unsw.infs3634.cryptoprofile.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinLoreResponse {

    @SerializedName("data")
    @Expose
    private List<Coin> data = null;
    @SerializedName("info")
    @Expose
    private Info info;

    public List<Coin> getData() {
        return data;
    }
}
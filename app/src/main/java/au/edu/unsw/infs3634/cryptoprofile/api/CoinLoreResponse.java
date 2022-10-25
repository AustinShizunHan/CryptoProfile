package au.edu.unsw.infs3634.cryptoprofile.api;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public Info getInfo() {return info;}

    public void setInfo(Info info) {this.info = info;}

    public static final String jsonData = "{\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"id\": \"90\",\n" +
            "      \"symbol\": \"BTC\",\n" +
            "      \"name\": \"Bitcoin\",\n" +
            "      \"nameid\": \"bitcoin\",\n" +
            "      \"rank\": 1,\n" +
            "      \"price_usd\": \"19402.17\",\n" +
            "      \"percent_change_24h\": \"1.34\",\n" +
            "      \"percent_change_1h\": \"-0.05\",\n" +
            "      \"percent_change_7d\": \"0.77\",\n" +
            "      \"price_btc\": \"1.00\",\n" +
            "      \"market_cap_usd\": \"371810027513.35\",\n" +
            "      \"volume24\": 23557399311.0271,\n" +
            "      \"volume24a\": 12213724259.303694,\n" +
            "      \"csupply\": \"19163321.00\",\n" +
            "      \"tsupply\": \"19163321\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"80\",\n" +
            "      \"symbol\": \"ETH\",\n" +
            "      \"name\": \"Ethereum\",\n" +
            "      \"nameid\": \"ethereum\",\n" +
            "      \"rank\": 2,\n" +
            "      \"price_usd\": \"1349.56\",\n" +
            "      \"percent_change_24h\": \"3.54\",\n" +
            "      \"percent_change_1h\": \"-0.01\",\n" +
            "      \"percent_change_7d\": \"3.48\",\n" +
            "      \"price_btc\": \"0.069564\",\n" +
            "      \"market_cap_usd\": \"165152840836.42\",\n" +
            "      \"volume24\": 9912673666.946146,\n" +
            "      \"volume24a\": 5732590273.471166,\n" +
            "      \"csupply\": \"122375302.00\",\n" +
            "      \"tsupply\": \"122375302\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"518\",\n" +
            "      \"symbol\": \"USDT\",\n" +
            "      \"name\": \"Tether\",\n" +
            "      \"nameid\": \"tether\",\n" +
            "      \"rank\": 3,\n" +
            "      \"price_usd\": \"1.00\",\n" +
            "      \"percent_change_24h\": \"0.13\",\n" +
            "      \"percent_change_1h\": \"-0.03\",\n" +
            "      \"percent_change_7d\": \"0.22\",\n" +
            "      \"price_btc\": \"0.000052\",\n" +
            "      \"market_cap_usd\": \"67106663555.86\",\n" +
            "      \"volume24\": 32061560107.444508,\n" +
            "      \"volume24a\": 19013224297.819748,\n" +
            "      \"csupply\": \"67037962684.00\",\n" +
            "      \"tsupply\": \"69158976373.909\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33285\",\n" +
            "      \"symbol\": \"USDC\",\n" +
            "      \"name\": \"USD Coin\",\n" +
            "      \"nameid\": \"usd-coin\",\n" +
            "      \"rank\": 4,\n" +
            "      \"price_usd\": \"0.999904\",\n" +
            "      \"percent_change_24h\": \"0.00\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"0.03\",\n" +
            "      \"price_btc\": \"0.000052\",\n" +
            "      \"market_cap_usd\": \"53799329447.92\",\n" +
            "      \"volume24\": 1364016812.408621,\n" +
            "      \"volume24a\": 1119398676.0457532,\n" +
            "      \"csupply\": \"53804476636.00\",\n" +
            "      \"tsupply\": \"53804476636.564\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2710\",\n" +
            "      \"symbol\": \"BNB\",\n" +
            "      \"name\": \"Binance Coin\",\n" +
            "      \"nameid\": \"binance-coin\",\n" +
            "      \"rank\": 5,\n" +
            "      \"price_usd\": \"274.40\",\n" +
            "      \"percent_change_24h\": \"1.90\",\n" +
            "      \"percent_change_1h\": \"-0.07\",\n" +
            "      \"percent_change_7d\": \"0.78\",\n" +
            "      \"price_btc\": \"0.014144\",\n" +
            "      \"market_cap_usd\": \"45770156409.64\",\n" +
            "      \"volume24\": 308118853.4254854,\n" +
            "      \"volume24a\": 204476037.17326757,\n" +
            "      \"csupply\": \"166801148.00\",\n" +
            "      \"tsupply\": \"192443301\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"58\",\n" +
            "      \"symbol\": \"XRP\",\n" +
            "      \"name\": \"XRP\",\n" +
            "      \"nameid\": \"ripple\",\n" +
            "      \"rank\": 6,\n" +
            "      \"price_usd\": \"0.456918\",\n" +
            "      \"percent_change_24h\": \"0.79\",\n" +
            "      \"percent_change_1h\": \"-0.25\",\n" +
            "      \"percent_change_7d\": \"-4.14\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"19606139441.44\",\n" +
            "      \"volume24\": 957485262.8703928,\n" +
            "      \"volume24a\": 642700572.6553047,\n" +
            "      \"csupply\": \"42909539227.00\",\n" +
            "      \"tsupply\": \"99991841593\",\n" +
            "      \"msupply\": \"100000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48591\",\n" +
            "      \"symbol\": \"BUSD\",\n" +
            "      \"name\": \"Binance USD\",\n" +
            "      \"nameid\": \"binance-usd\",\n" +
            "      \"rank\": 7,\n" +
            "      \"price_usd\": \"1.00\",\n" +
            "      \"percent_change_24h\": \"-0.03\",\n" +
            "      \"percent_change_1h\": \"0.02\",\n" +
            "      \"percent_change_7d\": \"0.07\",\n" +
            "      \"price_btc\": \"0.000052\",\n" +
            "      \"market_cap_usd\": \"17645710215.35\",\n" +
            "      \"volume24\": 4647168347.906998,\n" +
            "      \"volume24a\": 2502367519.5698667,\n" +
            "      \"csupply\": \"17642129423.00\",\n" +
            "      \"tsupply\": \"17642129423.309\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"257\",\n" +
            "      \"symbol\": \"ADA\",\n" +
            "      \"name\": \"Cardano\",\n" +
            "      \"nameid\": \"cardano\",\n" +
            "      \"rank\": 8,\n" +
            "      \"price_usd\": \"0.363628\",\n" +
            "      \"percent_change_24h\": \"4.98\",\n" +
            "      \"percent_change_1h\": \"0.15\",\n" +
            "      \"percent_change_7d\": \"-1.64\",\n" +
            "      \"price_btc\": \"0.000019\",\n" +
            "      \"market_cap_usd\": \"12339380226.48\",\n" +
            "      \"volume24\": 327018682.67120206,\n" +
            "      \"volume24a\": 282598758.04156685,\n" +
            "      \"csupply\": \"33934048405.00\",\n" +
            "      \"tsupply\": \"34277702081.605\",\n" +
            "      \"msupply\": \"45000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48543\",\n" +
            "      \"symbol\": \"SOL\",\n" +
            "      \"name\": \"Solana\",\n" +
            "      \"nameid\": \"solana\",\n" +
            "      \"rank\": 9,\n" +
            "      \"price_usd\": \"29.04\",\n" +
            "      \"percent_change_24h\": \"3.57\",\n" +
            "      \"percent_change_1h\": \"0.01\",\n" +
            "      \"percent_change_7d\": \"-3.58\",\n" +
            "      \"price_btc\": \"0.001497\",\n" +
            "      \"market_cap_usd\": \"10126247003.44\",\n" +
            "      \"volume24\": 538566960.3878994,\n" +
            "      \"volume24a\": 363996586.316748,\n" +
            "      \"csupply\": \"348706521.00\",\n" +
            "      \"tsupply\": \"491561409.22682\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2\",\n" +
            "      \"symbol\": \"DOGE\",\n" +
            "      \"name\": \"Dogecoin\",\n" +
            "      \"nameid\": \"dogecoin\",\n" +
            "      \"rank\": 10,\n" +
            "      \"price_usd\": \"0.059675\",\n" +
            "      \"percent_change_24h\": \"1.19\",\n" +
            "      \"percent_change_1h\": \"-0.19\",\n" +
            "      \"percent_change_7d\": \"1.22\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"8131807625.95\",\n" +
            "      \"volume24\": 165308839.19752637,\n" +
            "      \"volume24a\": 116226811.70743982,\n" +
            "      \"csupply\": \"136268646384.00\",\n" +
            "      \"tsupply\": \"136268646384\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"45219\",\n" +
            "      \"symbol\": \"DOT\",\n" +
            "      \"name\": \"Polkadot\",\n" +
            "      \"nameid\": \"polkadot\",\n" +
            "      \"rank\": 11,\n" +
            "      \"price_usd\": \"5.90\",\n" +
            "      \"percent_change_24h\": \"1.90\",\n" +
            "      \"percent_change_1h\": \"0.30\",\n" +
            "      \"percent_change_7d\": \"-4.61\",\n" +
            "      \"price_btc\": \"0.000304\",\n" +
            "      \"market_cap_usd\": \"6729045233.32\",\n" +
            "      \"volume24\": 201469224.45785183,\n" +
            "      \"volume24a\": 178510236.51621786,\n" +
            "      \"csupply\": \"1140780140.00\",\n" +
            "      \"tsupply\": \"1221728611.6701\",\n" +
            "      \"msupply\": \"1221728611.6701\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"45088\",\n" +
            "      \"symbol\": \"SHIB\",\n" +
            "      \"name\": \"Shiba Inu\",\n" +
            "      \"nameid\": \"shiba-inu\",\n" +
            "      \"rank\": 12,\n" +
            "      \"price_usd\": \"0.000010\",\n" +
            "      \"percent_change_24h\": \"1.18\",\n" +
            "      \"percent_change_1h\": \"-0.16\",\n" +
            "      \"percent_change_7d\": \"-2.46\",\n" +
            "      \"price_btc\": \"5.17E-10\",\n" +
            "      \"market_cap_usd\": \"5906482630.19\",\n" +
            "      \"volume24\": 146503722.56955543,\n" +
            "      \"volume24a\": 107365208.89552702,\n" +
            "      \"csupply\": \"589379786744780.00\",\n" +
            "      \"tsupply\": \"9.999912358371E+14\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"46971\",\n" +
            "      \"symbol\": \"STETH\",\n" +
            "      \"name\": \"Staked Ether\",\n" +
            "      \"nameid\": \"staked-ether\",\n" +
            "      \"rank\": 13,\n" +
            "      \"price_usd\": \"1343.87\",\n" +
            "      \"percent_change_24h\": \"3.49\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"3.62\",\n" +
            "      \"price_btc\": \"0.069271\",\n" +
            "      \"market_cap_usd\": \"5747562146.16\",\n" +
            "      \"volume24\": 3520140.4026918393,\n" +
            "      \"volume24a\": 3120989.385373906,\n" +
            "      \"csupply\": \"4276864.00\",\n" +
            "      \"tsupply\": null,\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2713\",\n" +
            "      \"symbol\": \"TRX\",\n" +
            "      \"name\": \"TRON\",\n" +
            "      \"nameid\": \"tron\",\n" +
            "      \"rank\": 14,\n" +
            "      \"price_usd\": \"0.061582\",\n" +
            "      \"percent_change_24h\": \"0.69\",\n" +
            "      \"percent_change_1h\": \"-0.25\",\n" +
            "      \"percent_change_7d\": \"-0.24\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"5690647117.92\",\n" +
            "      \"volume24\": 252667864.84544703,\n" +
            "      \"volume24a\": 221259075.58762547,\n" +
            "      \"csupply\": \"92407612370.00\",\n" +
            "      \"tsupply\": \"92407616954.28\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33422\",\n" +
            "      \"symbol\": \"WBTC\",\n" +
            "      \"name\": \"Wrapped Bitcoin\",\n" +
            "      \"nameid\": \"wrapped-bitcoin\",\n" +
            "      \"rank\": 15,\n" +
            "      \"price_usd\": \"19396.60\",\n" +
            "      \"percent_change_24h\": \"1.32\",\n" +
            "      \"percent_change_1h\": \"-0.06\",\n" +
            "      \"percent_change_7d\": \"0.70\",\n" +
            "      \"price_btc\": \"0.999807\",\n" +
            "      \"market_cap_usd\": \"4802055412.93\",\n" +
            "      \"volume24\": 62895158.78247046,\n" +
            "      \"volume24a\": 34181866.888360955,\n" +
            "      \"csupply\": \"247572.00\",\n" +
            "      \"tsupply\": \"247572.07978736\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"47305\",\n" +
            "      \"symbol\": \"UNI\",\n" +
            "      \"name\": \"Uniswap\",\n" +
            "      \"nameid\": \"uniswap\",\n" +
            "      \"rank\": 16,\n" +
            "      \"price_usd\": \"6.19\",\n" +
            "      \"percent_change_24h\": \"3.00\",\n" +
            "      \"percent_change_1h\": \"-0.02\",\n" +
            "      \"percent_change_7d\": \"1.48\",\n" +
            "      \"price_btc\": \"0.000319\",\n" +
            "      \"market_cap_usd\": \"4613948026.67\",\n" +
            "      \"volume24\": 82818345.29350534,\n" +
            "      \"volume24a\": 61869888.76334549,\n" +
            "      \"csupply\": \"745440305.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"44883\",\n" +
            "      \"symbol\": \"AVAX\",\n" +
            "      \"name\": \"Avalanche\",\n" +
            "      \"nameid\": \"avalanche\",\n" +
            "      \"rank\": 17,\n" +
            "      \"price_usd\": \"16.05\",\n" +
            "      \"percent_change_24h\": \"2.46\",\n" +
            "      \"percent_change_1h\": \"-0.08\",\n" +
            "      \"percent_change_7d\": \"2.01\",\n" +
            "      \"price_btc\": \"0.000827\",\n" +
            "      \"market_cap_usd\": \"4573649055.41\",\n" +
            "      \"volume24\": 109572525.0216798,\n" +
            "      \"volume24a\": 108160594.8108328,\n" +
            "      \"csupply\": \"284938860.00\",\n" +
            "      \"tsupply\": \"404229626.49901\",\n" +
            "      \"msupply\": \"720000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33833\",\n" +
            "      \"symbol\": \"LEO\",\n" +
            "      \"name\": \"UNUS SED LEO\",\n" +
            "      \"nameid\": \"unus-sed-leo\",\n" +
            "      \"rank\": 18,\n" +
            "      \"price_usd\": \"4.06\",\n" +
            "      \"percent_change_24h\": \"-1.64\",\n" +
            "      \"percent_change_1h\": \"-0.04\",\n" +
            "      \"percent_change_7d\": \"-9.43\",\n" +
            "      \"price_btc\": \"0.000209\",\n" +
            "      \"market_cap_usd\": \"3876303591.09\",\n" +
            "      \"volume24\": 3025818.5068364926,\n" +
            "      \"volume24a\": 2562206.843900571,\n" +
            "      \"csupply\": \"953954130.00\",\n" +
            "      \"tsupply\": \"985239504\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"1\",\n" +
            "      \"symbol\": \"LTC\",\n" +
            "      \"name\": \"Litecoin\",\n" +
            "      \"nameid\": \"litecoin\",\n" +
            "      \"rank\": 19,\n" +
            "      \"price_usd\": \"53.25\",\n" +
            "      \"percent_change_24h\": \"2.40\",\n" +
            "      \"percent_change_1h\": \"-0.01\",\n" +
            "      \"percent_change_7d\": \"3.59\",\n" +
            "      \"price_btc\": \"0.002745\",\n" +
            "      \"market_cap_usd\": \"3795183082.57\",\n" +
            "      \"volume24\": 417155636.16486794,\n" +
            "      \"volume24a\": 324923029.92571956,\n" +
            "      \"csupply\": \"71271394.00\",\n" +
            "      \"tsupply\": \"71271394\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33830\",\n" +
            "      \"symbol\": \"ATOM\",\n" +
            "      \"name\": \"Cosmos\",\n" +
            "      \"nameid\": \"cosmos\",\n" +
            "      \"rank\": 20,\n" +
            "      \"price_usd\": \"11.87\",\n" +
            "      \"percent_change_24h\": \"3.26\",\n" +
            "      \"percent_change_1h\": \"-0.09\",\n" +
            "      \"percent_change_7d\": \"1.23\",\n" +
            "      \"price_btc\": \"0.000612\",\n" +
            "      \"market_cap_usd\": \"3399220589.82\",\n" +
            "      \"volume24\": 154782064.45240062,\n" +
            "      \"volume24a\": 111058229.54050101,\n" +
            "      \"csupply\": \"286370297.00\",\n" +
            "      \"tsupply\": \"286370297\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2751\",\n" +
            "      \"symbol\": \"LINK\",\n" +
            "      \"name\": \"ChainLink\",\n" +
            "      \"nameid\": \"chainlink\",\n" +
            "      \"rank\": 21,\n" +
            "      \"price_usd\": \"6.95\",\n" +
            "      \"percent_change_24h\": \"1.45\",\n" +
            "      \"percent_change_1h\": \"-0.12\",\n" +
            "      \"percent_change_7d\": \"-3.02\",\n" +
            "      \"price_btc\": \"0.000358\",\n" +
            "      \"market_cap_usd\": \"3268700246.02\",\n" +
            "      \"volume24\": 239674768.77388448,\n" +
            "      \"volume24a\": 192057268.90977705,\n" +
            "      \"csupply\": \"470099970.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"118\",\n" +
            "      \"symbol\": \"ETC\",\n" +
            "      \"name\": \"Ethereum Classic\",\n" +
            "      \"nameid\": \"ethereum-classic\",\n" +
            "      \"rank\": 22,\n" +
            "      \"price_usd\": \"22.79\",\n" +
            "      \"percent_change_24h\": \"-0.36\",\n" +
            "      \"percent_change_1h\": \"-0.23\",\n" +
            "      \"percent_change_7d\": \"-1.80\",\n" +
            "      \"price_btc\": \"0.001175\",\n" +
            "      \"market_cap_usd\": \"3106263849.89\",\n" +
            "      \"volume24\": 315080440.4925607,\n" +
            "      \"volume24a\": 471655484.83484274,\n" +
            "      \"csupply\": \"136324369.00\",\n" +
            "      \"tsupply\": \"210700000\",\n" +
            "      \"msupply\": \"210700000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48547\",\n" +
            "      \"symbol\": \"FTT\",\n" +
            "      \"name\": \"FTX Token\",\n" +
            "      \"nameid\": \"ftx-token\",\n" +
            "      \"rank\": 23,\n" +
            "      \"price_usd\": \"22.93\",\n" +
            "      \"percent_change_24h\": \"2.15\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"-3.25\",\n" +
            "      \"price_btc\": \"0.001182\",\n" +
            "      \"market_cap_usd\": \"3086619187.49\",\n" +
            "      \"volume24\": 29104702.90798856,\n" +
            "      \"volume24a\": 16943066.48466369,\n" +
            "      \"csupply\": \"134598602.00\",\n" +
            "      \"tsupply\": \"330467938.53597\",\n" +
            "      \"msupply\": \"352170015\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"89\",\n" +
            "      \"symbol\": \"XLM\",\n" +
            "      \"name\": \"Stellar\",\n" +
            "      \"nameid\": \"stellar\",\n" +
            "      \"rank\": 24,\n" +
            "      \"price_usd\": \"0.110849\",\n" +
            "      \"percent_change_24h\": \"1.63\",\n" +
            "      \"percent_change_1h\": \"-0.15\",\n" +
            "      \"percent_change_7d\": \"-2.22\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"2823651755.32\",\n" +
            "      \"volume24\": 62436841.84783925,\n" +
            "      \"volume24a\": 45481569.77286465,\n" +
            "      \"csupply\": \"25473029818.00\",\n" +
            "      \"tsupply\": \"104303927518\",\n" +
            "      \"msupply\": \"104303927518\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"28\",\n" +
            "      \"symbol\": \"XMR\",\n" +
            "      \"name\": \"Monero\",\n" +
            "      \"nameid\": \"monero\",\n" +
            "      \"rank\": 25,\n" +
            "      \"price_usd\": \"142.37\",\n" +
            "      \"percent_change_24h\": \"-0.83\",\n" +
            "      \"percent_change_1h\": \"-0.56\",\n" +
            "      \"percent_change_7d\": \"-0.29\",\n" +
            "      \"price_btc\": \"0.007339\",\n" +
            "      \"market_cap_usd\": \"2585559067.96\",\n" +
            "      \"volume24\": 74876046.73760657,\n" +
            "      \"volume24a\": 57537716.89219042,\n" +
            "      \"csupply\": \"18160410.00\",\n" +
            "      \"tsupply\": \"18160410.1566\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48563\",\n" +
            "      \"symbol\": \"NEAR\",\n" +
            "      \"name\": \"NEAR Protocol\",\n" +
            "      \"nameid\": \"near-protocol\",\n" +
            "      \"rank\": 26,\n" +
            "      \"price_usd\": \"2.96\",\n" +
            "      \"percent_change_24h\": \"3.83\",\n" +
            "      \"percent_change_1h\": \"0.30\",\n" +
            "      \"percent_change_7d\": \"-1.14\",\n" +
            "      \"price_btc\": \"0.000153\",\n" +
            "      \"market_cap_usd\": \"2246050403.16\",\n" +
            "      \"volume24\": 89149656.58746393,\n" +
            "      \"volume24a\": 70760782.25625576,\n" +
            "      \"csupply\": \"757769910.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"34406\",\n" +
            "      \"symbol\": \"ALGO\",\n" +
            "      \"name\": \"Algorand\",\n" +
            "      \"nameid\": \"algorand\",\n" +
            "      \"rank\": 27,\n" +
            "      \"price_usd\": \"0.311488\",\n" +
            "      \"percent_change_24h\": \"1.29\",\n" +
            "      \"percent_change_1h\": \"-0.07\",\n" +
            "      \"percent_change_7d\": \"-3.36\",\n" +
            "      \"price_btc\": \"0.000016\",\n" +
            "      \"market_cap_usd\": \"2146094638.24\",\n" +
            "      \"volume24\": 39564416.75726318,\n" +
            "      \"volume24a\": 30689793.723890822,\n" +
            "      \"csupply\": \"6889812320.00\",\n" +
            "      \"tsupply\": \"7295127844.6947\",\n" +
            "      \"msupply\": \"10000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33085\",\n" +
            "      \"symbol\": \"QNT\",\n" +
            "      \"name\": \"Quant\",\n" +
            "      \"nameid\": \"quant\",\n" +
            "      \"rank\": 28,\n" +
            "      \"price_usd\": \"174.08\",\n" +
            "      \"percent_change_24h\": \"1.19\",\n" +
            "      \"percent_change_1h\": \"0.11\",\n" +
            "      \"percent_change_7d\": \"-8.93\",\n" +
            "      \"price_btc\": \"0.008973\",\n" +
            "      \"market_cap_usd\": \"2101577146.43\",\n" +
            "      \"volume24\": 46035975.63866966,\n" +
            "      \"volume24a\": 53768898.11411665,\n" +
            "      \"csupply\": \"12072738.00\",\n" +
            "      \"tsupply\": \"14612493.080826\",\n" +
            "      \"msupply\": \"14612493.080826\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2321\",\n" +
            "      \"symbol\": \"BCH\",\n" +
            "      \"name\": \"Bitcoin Cash\",\n" +
            "      \"nameid\": \"bitcoin-cash\",\n" +
            "      \"rank\": 29,\n" +
            "      \"price_usd\": \"108.85\",\n" +
            "      \"percent_change_24h\": \"0.64\",\n" +
            "      \"percent_change_1h\": \"0.10\",\n" +
            "      \"percent_change_7d\": \"-0.94\",\n" +
            "      \"price_btc\": \"0.005611\",\n" +
            "      \"market_cap_usd\": \"2088454453.45\",\n" +
            "      \"volume24\": 215441629.74758932,\n" +
            "      \"volume24a\": 205402570.28805885,\n" +
            "      \"csupply\": \"19186312.00\",\n" +
            "      \"tsupply\": \"19186312\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33536\",\n" +
            "      \"symbol\": \"MATIC\",\n" +
            "      \"name\": \"Matic Network\",\n" +
            "      \"nameid\": \"matic-network\",\n" +
            "      \"rank\": 30,\n" +
            "      \"price_usd\": \"0.895019\",\n" +
            "      \"percent_change_24h\": \"8.90\",\n" +
            "      \"percent_change_1h\": \"-0.23\",\n" +
            "      \"percent_change_7d\": \"12.01\",\n" +
            "      \"price_btc\": \"0.000046\",\n" +
            "      \"market_cap_usd\": \"1946835842.90\",\n" +
            "      \"volume24\": 405851391.72778004,\n" +
            "      \"volume24a\": 159017796.41335315,\n" +
            "      \"csupply\": \"2175190262.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2741\",\n" +
            "      \"symbol\": \"VET\",\n" +
            "      \"name\": \"VeChain\",\n" +
            "      \"nameid\": \"vechain\",\n" +
            "      \"rank\": 31,\n" +
            "      \"price_usd\": \"0.022529\",\n" +
            "      \"percent_change_24h\": \"1.41\",\n" +
            "      \"percent_change_1h\": \"-0.09\",\n" +
            "      \"percent_change_7d\": \"-1.97\",\n" +
            "      \"price_btc\": \"0.000001\",\n" +
            "      \"market_cap_usd\": \"1633573491.08\",\n" +
            "      \"volume24\": 37484706.03923016,\n" +
            "      \"volume24a\": 32302340.258082688,\n" +
            "      \"csupply\": \"72511146418.00\",\n" +
            "      \"tsupply\": \"85985041177\",\n" +
            "      \"msupply\": \"86712634466\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48589\",\n" +
            "      \"symbol\": \"FLOW\",\n" +
            "      \"name\": \"Flow\",\n" +
            "      \"nameid\": \"flow\",\n" +
            "      \"rank\": 32,\n" +
            "      \"price_usd\": \"1.50\",\n" +
            "      \"percent_change_24h\": \"4.14\",\n" +
            "      \"percent_change_1h\": \"0.03\",\n" +
            "      \"percent_change_7d\": \"0.22\",\n" +
            "      \"price_btc\": \"0.000077\",\n" +
            "      \"market_cap_usd\": \"1553311882.34\",\n" +
            "      \"volume24\": 37359461.03478443,\n" +
            "      \"volume24a\": 22473089.09418707,\n" +
            "      \"csupply\": \"1036200000.00\",\n" +
            "      \"tsupply\": \"1390757889\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48537\",\n" +
            "      \"symbol\": \"LUNC\",\n" +
            "      \"name\": \"Terra Classic\",\n" +
            "      \"nameid\": \"terra-luna\",\n" +
            "      \"rank\": 33,\n" +
            "      \"price_usd\": \"0.000234\",\n" +
            "      \"percent_change_24h\": \"2.98\",\n" +
            "      \"percent_change_1h\": \"-0.16\",\n" +
            "      \"percent_change_7d\": \"-10.94\",\n" +
            "      \"price_btc\": \"1.21E-8\",\n" +
            "      \"market_cap_usd\": \"1537767937.52\",\n" +
            "      \"volume24\": 135005967.0641286,\n" +
            "      \"volume24a\": 86065665.66603927,\n" +
            "      \"csupply\": \"6576804998885.00\",\n" +
            "      \"tsupply\": \"6576804998885.5\",\n" +
            "      \"msupply\": \"6576804998885.5\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"46968\",\n" +
            "      \"symbol\": \"FRAX\",\n" +
            "      \"name\": \"Frax\",\n" +
            "      \"nameid\": \"frax\",\n" +
            "      \"rank\": 34,\n" +
            "      \"price_usd\": \"0.999135\",\n" +
            "      \"percent_change_24h\": \"2.23\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"-0.70\",\n" +
            "      \"price_btc\": \"0.000052\",\n" +
            "      \"market_cap_usd\": \"1430457176.09\",\n" +
            "      \"volume24\": 950555.4850269831,\n" +
            "      \"volume24a\": 229030.68537965417,\n" +
            "      \"csupply\": \"1431695664.00\",\n" +
            "      \"tsupply\": \"1431695664.4215\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"45930\",\n" +
            "      \"symbol\": \"APE\",\n" +
            "      \"name\": \"APEcoin\",\n" +
            "      \"nameid\": \"apecoin\",\n" +
            "      \"rank\": 35,\n" +
            "      \"price_usd\": \"4.62\",\n" +
            "      \"percent_change_24h\": \"2.42\",\n" +
            "      \"percent_change_1h\": \"0.73\",\n" +
            "      \"percent_change_7d\": \"2.18\",\n" +
            "      \"price_btc\": \"0.000238\",\n" +
            "      \"market_cap_usd\": \"1417679222.19\",\n" +
            "      \"volume24\": 121270097.34879924,\n" +
            "      \"volume24a\": 104731765.29523543,\n" +
            "      \"csupply\": \"306875000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32351\",\n" +
            "      \"symbol\": \"HT\",\n" +
            "      \"name\": \"Huobi Token\",\n" +
            "      \"nameid\": \"huobi-token\",\n" +
            "      \"rank\": 36,\n" +
            "      \"price_usd\": \"8.64\",\n" +
            "      \"percent_change_24h\": \"0.87\",\n" +
            "      \"percent_change_1h\": \"0.17\",\n" +
            "      \"percent_change_7d\": \"26.09\",\n" +
            "      \"price_btc\": \"0.000445\",\n" +
            "      \"market_cap_usd\": \"1329650677.55\",\n" +
            "      \"volume24\": 26166365.18389211,\n" +
            "      \"volume24a\": 40814809.74122182,\n" +
            "      \"csupply\": \"153920626.00\",\n" +
            "      \"tsupply\": \"500000000\",\n" +
            "      \"msupply\": \"500000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32607\",\n" +
            "      \"symbol\": \"FIL\",\n" +
            "      \"name\": \"Filecoin\",\n" +
            "      \"nameid\": \"filecoin\",\n" +
            "      \"rank\": 37,\n" +
            "      \"price_usd\": \"5.04\",\n" +
            "      \"percent_change_24h\": \"1.12\",\n" +
            "      \"percent_change_1h\": \"-0.04\",\n" +
            "      \"percent_change_7d\": \"-2.08\",\n" +
            "      \"price_btc\": \"0.000260\",\n" +
            "      \"market_cap_usd\": \"1309057179.71\",\n" +
            "      \"volume24\": 88879234.27335025,\n" +
            "      \"volume24a\": 72602196.6613377,\n" +
            "      \"csupply\": \"259872785.00\",\n" +
            "      \"tsupply\": \"259872785\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32479\",\n" +
            "      \"symbol\": \"TUSD\",\n" +
            "      \"name\": \"TrueUSD\",\n" +
            "      \"nameid\": \"trueusd\",\n" +
            "      \"rank\": 38,\n" +
            "      \"price_usd\": \"1.00\",\n" +
            "      \"percent_change_24h\": \"0.07\",\n" +
            "      \"percent_change_1h\": \"-0.01\",\n" +
            "      \"percent_change_7d\": \"0.04\",\n" +
            "      \"price_btc\": \"0.000052\",\n" +
            "      \"market_cap_usd\": \"1226984784.70\",\n" +
            "      \"volume24\": 46530607.222333394,\n" +
            "      \"volume24a\": 41399759.8452671,\n" +
            "      \"csupply\": \"1226956699.00\",\n" +
            "      \"tsupply\": \"1227899013.9824\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"46018\",\n" +
            "      \"symbol\": \"AAVE\",\n" +
            "      \"name\": \"Aave\",\n" +
            "      \"nameid\": \"aave\",\n" +
            "      \"rank\": 39,\n" +
            "      \"price_usd\": \"87.60\",\n" +
            "      \"percent_change_24h\": \"6.94\",\n" +
            "      \"percent_change_1h\": \"0.21\",\n" +
            "      \"percent_change_7d\": \"15.85\",\n" +
            "      \"price_btc\": \"0.004515\",\n" +
            "      \"market_cap_usd\": \"1225162160.10\",\n" +
            "      \"volume24\": 105585650.5367379,\n" +
            "      \"volume24a\": 61316572.73397766,\n" +
            "      \"csupply\": \"13986589.00\",\n" +
            "      \"tsupply\": \"16000000\",\n" +
            "      \"msupply\": \"16000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3682\",\n" +
            "      \"symbol\": \"XTZ\",\n" +
            "      \"name\": \"Tezos\",\n" +
            "      \"nameid\": \"tezos\",\n" +
            "      \"rank\": 40,\n" +
            "      \"price_usd\": \"1.35\",\n" +
            "      \"percent_change_24h\": \"1.40\",\n" +
            "      \"percent_change_1h\": \"-0.23\",\n" +
            "      \"percent_change_7d\": \"0.00\",\n" +
            "      \"price_btc\": \"0.000070\",\n" +
            "      \"market_cap_usd\": \"1224282310.66\",\n" +
            "      \"volume24\": 13800715.405900838,\n" +
            "      \"volume24a\": 9677762.526052488,\n" +
            "      \"csupply\": \"905053908.00\",\n" +
            "      \"tsupply\": \"926595760.38455\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"44035\",\n" +
            "      \"symbol\": \"TKX\",\n" +
            "      \"name\": \"Tokenize Xchange\",\n" +
            "      \"nameid\": \"tokenize-xchange\",\n" +
            "      \"rank\": 41,\n" +
            "      \"price_usd\": \"14.55\",\n" +
            "      \"percent_change_24h\": \"13.76\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"14.69\",\n" +
            "      \"price_btc\": \"0.000750\",\n" +
            "      \"market_cap_usd\": \"1163995115.99\",\n" +
            "      \"volume24\": 100895059.15019985,\n" +
            "      \"volume24a\": 53442112.38579275,\n" +
            "      \"csupply\": \"79996000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"258\",\n" +
            "      \"symbol\": \"MANA\",\n" +
            "      \"name\": \"Decentraland\",\n" +
            "      \"nameid\": \"decentraland\",\n" +
            "      \"rank\": 42,\n" +
            "      \"price_usd\": \"0.605910\",\n" +
            "      \"percent_change_24h\": \"0.72\",\n" +
            "      \"percent_change_1h\": \"0.11\",\n" +
            "      \"percent_change_7d\": \"-5.46\",\n" +
            "      \"price_btc\": \"0.000031\",\n" +
            "      \"market_cap_usd\": \"1122403669.33\",\n" +
            "      \"volume24\": 71820720.75514565,\n" +
            "      \"volume24a\": 50892871.96061248,\n" +
            "      \"csupply\": \"1852426497.00\",\n" +
            "      \"tsupply\": \"2193572727.3201\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"34391\",\n" +
            "      \"symbol\": \"CHZ\",\n" +
            "      \"name\": \"Chiliz\",\n" +
            "      \"nameid\": \"chiliz\",\n" +
            "      \"rank\": 43,\n" +
            "      \"price_usd\": \"0.183459\",\n" +
            "      \"percent_change_24h\": \"3.02\",\n" +
            "      \"percent_change_1h\": \"0.45\",\n" +
            "      \"percent_change_7d\": \"1.06\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"1100825603.94\",\n" +
            "      \"volume24\": 94333684.64485961,\n" +
            "      \"volume24a\": 90043248.67862451,\n" +
            "      \"csupply\": \"6000387492.00\",\n" +
            "      \"tsupply\": \"8888888888\",\n" +
            "      \"msupply\": \"8888888888\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2679\",\n" +
            "      \"symbol\": \"EOS\",\n" +
            "      \"name\": \"EOS\",\n" +
            "      \"nameid\": \"eos\",\n" +
            "      \"rank\": 44,\n" +
            "      \"price_usd\": \"1.07\",\n" +
            "      \"percent_change_24h\": \"0.37\",\n" +
            "      \"percent_change_1h\": \"0.10\",\n" +
            "      \"percent_change_7d\": \"2.09\",\n" +
            "      \"price_btc\": \"0.000055\",\n" +
            "      \"market_cap_usd\": \"1071693258.72\",\n" +
            "      \"volume24\": 168873813.60296676,\n" +
            "      \"volume24a\": 164191698.42592672,\n" +
            "      \"csupply\": \"996999248.00\",\n" +
            "      \"tsupply\": \"1061006819.1993\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"44036\",\n" +
            "      \"symbol\": \"CUSDC\",\n" +
            "      \"name\": \"Compound USD Coin\",\n" +
            "      \"nameid\": \"compound-usd-coin\",\n" +
            "      \"rank\": 45,\n" +
            "      \"price_usd\": \"0.022863\",\n" +
            "      \"percent_change_24h\": \"0.53\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"0.87\",\n" +
            "      \"price_btc\": \"0.000001\",\n" +
            "      \"market_cap_usd\": \"1018894984.86\",\n" +
            "      \"volume24\": 2697722.5239565573,\n" +
            "      \"volume24a\": 9094991.511489864,\n" +
            "      \"csupply\": \"44564678457.00\",\n" +
            "      \"tsupply\": \"44564678457.451\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32360\",\n" +
            "      \"symbol\": \"THETA\",\n" +
            "      \"name\": \"Theta Token\",\n" +
            "      \"nameid\": \"theta-token\",\n" +
            "      \"rank\": 46,\n" +
            "      \"price_usd\": \"1.02\",\n" +
            "      \"percent_change_24h\": \"3.29\",\n" +
            "      \"percent_change_1h\": \"0.24\",\n" +
            "      \"percent_change_7d\": \"1.16\",\n" +
            "      \"price_btc\": \"0.000052\",\n" +
            "      \"market_cap_usd\": \"1018208223.43\",\n" +
            "      \"volume24\": 19653712.558831614,\n" +
            "      \"volume24a\": 9631320.754549805,\n" +
            "      \"csupply\": \"1000000000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33819\",\n" +
            "      \"symbol\": \"CRO\",\n" +
            "      \"name\": \"Crypto.com Chain\",\n" +
            "      \"nameid\": \"crypto-com-chain\",\n" +
            "      \"rank\": 47,\n" +
            "      \"price_usd\": \"0.105585\",\n" +
            "      \"percent_change_24h\": \"1.07\",\n" +
            "      \"percent_change_1h\": \"-0.14\",\n" +
            "      \"percent_change_7d\": \"0.70\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"979915178.65\",\n" +
            "      \"volume24\": 7017021.594481302,\n" +
            "      \"volume24a\": 10944399.094904881,\n" +
            "      \"csupply\": \"9280821918.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"45161\",\n" +
            "      \"symbol\": \"SAND\",\n" +
            "      \"name\": \"The Sandbox\",\n" +
            "      \"nameid\": \"the-sandbox\",\n" +
            "      \"rank\": 48,\n" +
            "      \"price_usd\": \"0.747266\",\n" +
            "      \"percent_change_24h\": \"2.31\",\n" +
            "      \"percent_change_1h\": \"-0.08\",\n" +
            "      \"percent_change_7d\": \"-3.84\",\n" +
            "      \"price_btc\": \"0.000039\",\n" +
            "      \"market_cap_usd\": \"959534695.90\",\n" +
            "      \"volume24\": 103436973.3854626,\n" +
            "      \"volume24a\": 81110603.13965116,\n" +
            "      \"csupply\": \"1284060208.00\",\n" +
            "      \"tsupply\": \"3000000000\",\n" +
            "      \"msupply\": \"3000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33531\",\n" +
            "      \"symbol\": \"OKB\",\n" +
            "      \"name\": \"OKB\",\n" +
            "      \"nameid\": \"okb\",\n" +
            "      \"rank\": 49,\n" +
            "      \"price_usd\": \"15.60\",\n" +
            "      \"percent_change_24h\": \"0.23\",\n" +
            "      \"percent_change_1h\": \"0.36\",\n" +
            "      \"percent_change_7d\": \"-5.41\",\n" +
            "      \"price_btc\": \"0.000804\",\n" +
            "      \"market_cap_usd\": \"935850228.50\",\n" +
            "      \"volume24\": 22545399.60104801,\n" +
            "      \"volume24a\": 15519231.456412794,\n" +
            "      \"csupply\": \"60000000.00\",\n" +
            "      \"tsupply\": \"300000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"12377\",\n" +
            "      \"symbol\": \"MKR\",\n" +
            "      \"name\": \"Maker\",\n" +
            "      \"nameid\": \"maker\",\n" +
            "      \"rank\": 50,\n" +
            "      \"price_usd\": \"944.22\",\n" +
            "      \"percent_change_24h\": \"-1.65\",\n" +
            "      \"percent_change_1h\": \"0.66\",\n" +
            "      \"percent_change_7d\": \"-5.27\",\n" +
            "      \"price_btc\": \"0.048670\",\n" +
            "      \"market_cap_usd\": \"923102022.29\",\n" +
            "      \"volume24\": 29820030.436512038,\n" +
            "      \"volume24a\": 25203069.88837202,\n" +
            "      \"csupply\": \"977631.00\",\n" +
            "      \"tsupply\": \"977631.03695089\",\n" +
            "      \"msupply\": \"1005577\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33234\",\n" +
            "      \"symbol\": \"BCHSV\",\n" +
            "      \"name\": \"Bitcoin SV\",\n" +
            "      \"nameid\": \"bitcoin-cash-sv\",\n" +
            "      \"rank\": 51,\n" +
            "      \"price_usd\": \"46.97\",\n" +
            "      \"percent_change_24h\": \"0.52\",\n" +
            "      \"percent_change_1h\": \"0.11\",\n" +
            "      \"percent_change_7d\": \"-3.61\",\n" +
            "      \"price_btc\": \"0.002421\",\n" +
            "      \"market_cap_usd\": \"901002521.38\",\n" +
            "      \"volume24\": 59265358.987307824,\n" +
            "      \"volume24a\": 74720086.31018573,\n" +
            "      \"csupply\": \"19182533.00\",\n" +
            "      \"tsupply\": \"21000000\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"64671\",\n" +
            "      \"symbol\": \"USDP\",\n" +
            "      \"name\": \"Pax Dollar\",\n" +
            "      \"nameid\": \"pax-dollar\",\n" +
            "      \"rank\": 52,\n" +
            "      \"price_usd\": \"0.995433\",\n" +
            "      \"percent_change_24h\": \"-0.13\",\n" +
            "      \"percent_change_1h\": \"-0.06\",\n" +
            "      \"percent_change_7d\": \"-0.32\",\n" +
            "      \"price_btc\": \"0.000051\",\n" +
            "      \"market_cap_usd\": \"856339640.64\",\n" +
            "      \"volume24\": 20013567.123727337,\n" +
            "      \"volume24a\": 19339577.305404503,\n" +
            "      \"csupply\": \"860268741.00\",\n" +
            "      \"tsupply\": null,\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"46981\",\n" +
            "      \"symbol\": \"LDO\",\n" +
            "      \"name\": \"Lido DAO\",\n" +
            "      \"nameid\": \"lido-dao\",\n" +
            "      \"rank\": 53,\n" +
            "      \"price_usd\": \"1.54\",\n" +
            "      \"percent_change_24h\": \"4.75\",\n" +
            "      \"percent_change_1h\": \"-0.08\",\n" +
            "      \"percent_change_7d\": \"14.49\",\n" +
            "      \"price_btc\": \"0.000079\",\n" +
            "      \"market_cap_usd\": \"851527756.45\",\n" +
            "      \"volume24\": 17740452.603005875,\n" +
            "      \"volume24a\": 10835692.431375382,\n" +
            "      \"csupply\": \"552687639.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2750\",\n" +
            "      \"symbol\": \"KCS\",\n" +
            "      \"name\": \"KuCoin Shares\",\n" +
            "      \"nameid\": \"kucoin-shares\",\n" +
            "      \"rank\": 54,\n" +
            "      \"price_usd\": \"9.56\",\n" +
            "      \"percent_change_24h\": \"0.41\",\n" +
            "      \"percent_change_1h\": \"-0.12\",\n" +
            "      \"percent_change_7d\": \"-2.55\",\n" +
            "      \"price_btc\": \"0.000493\",\n" +
            "      \"market_cap_usd\": \"847968977.01\",\n" +
            "      \"volume24\": 1474623.9794301095,\n" +
            "      \"volume24a\": 955579.0280977926,\n" +
            "      \"csupply\": \"88745681.00\",\n" +
            "      \"tsupply\": \"170118638\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"44034\",\n" +
            "      \"symbol\": \"CDAI\",\n" +
            "      \"name\": \"Compound Dai\",\n" +
            "      \"nameid\": \"compound-dai\",\n" +
            "      \"rank\": 55,\n" +
            "      \"price_usd\": \"0.022099\",\n" +
            "      \"percent_change_24h\": \"1.74\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"2.43\",\n" +
            "      \"price_btc\": \"0.000001\",\n" +
            "      \"market_cap_usd\": \"831619407.52\",\n" +
            "      \"volume24\": 15230387.873117972,\n" +
            "      \"volume24a\": 3341591.231057901,\n" +
            "      \"csupply\": \"37631506011.00\",\n" +
            "      \"tsupply\": \"37631506011.499\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"134\",\n" +
            "      \"symbol\": \"ZEC\",\n" +
            "      \"name\": \"Zcash\",\n" +
            "      \"nameid\": \"zcash\",\n" +
            "      \"rank\": 56,\n" +
            "      \"price_usd\": \"52.05\",\n" +
            "      \"percent_change_24h\": \"0.14\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"0.38\",\n" +
            "      \"price_btc\": \"0.002683\",\n" +
            "      \"market_cap_usd\": \"799785961.85\",\n" +
            "      \"volume24\": 64781457.21185926,\n" +
            "      \"volume24a\": 60775547.98286498,\n" +
            "      \"csupply\": \"15365875.00\",\n" +
            "      \"tsupply\": \"15365875\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"45467\",\n" +
            "      \"symbol\": \"EGLD\",\n" +
            "      \"name\": \"Elrond eGold\",\n" +
            "      \"nameid\": \"elrond-egold\",\n" +
            "      \"rank\": 57,\n" +
            "      \"price_usd\": \"58.23\",\n" +
            "      \"percent_change_24h\": \"5.98\",\n" +
            "      \"percent_change_1h\": \"0.02\",\n" +
            "      \"percent_change_7d\": \"4.60\",\n" +
            "      \"price_btc\": \"0.003001\",\n" +
            "      \"market_cap_usd\": \"786540098.79\",\n" +
            "      \"volume24\": 13903509.52874562,\n" +
            "      \"volume24a\": 8644506.634357104,\n" +
            "      \"csupply\": \"13508333.00\",\n" +
            "      \"tsupply\": \"20000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"46575\",\n" +
            "      \"symbol\": \"AXS\",\n" +
            "      \"name\": \"Axie Infinity\",\n" +
            "      \"nameid\": \"axie-infinity\",\n" +
            "      \"rank\": 58,\n" +
            "      \"price_usd\": \"8.62\",\n" +
            "      \"percent_change_24h\": \"-1.00\",\n" +
            "      \"percent_change_1h\": \"-0.24\",\n" +
            "      \"percent_change_7d\": \"-21.88\",\n" +
            "      \"price_btc\": \"0.000445\",\n" +
            "      \"market_cap_usd\": \"774618920.94\",\n" +
            "      \"volume24\": 101522943.79878248,\n" +
            "      \"volume24a\": 89996000.04891048,\n" +
            "      \"csupply\": \"89822353.00\",\n" +
            "      \"tsupply\": \"270000000\",\n" +
            "      \"msupply\": \"270000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"69801\",\n" +
            "      \"symbol\": \"USDD\",\n" +
            "      \"name\": \"USDD\",\n" +
            "      \"nameid\": \"usdd\",\n" +
            "      \"rank\": 59,\n" +
            "      \"price_usd\": \"0.996629\",\n" +
            "      \"percent_change_24h\": \"0.05\",\n" +
            "      \"percent_change_1h\": \"-0.04\",\n" +
            "      \"percent_change_7d\": \"-0.23\",\n" +
            "      \"price_btc\": \"0.000051\",\n" +
            "      \"market_cap_usd\": \"742819622.77\",\n" +
            "      \"volume24\": 23021859.76757339,\n" +
            "      \"volume24a\": 20078306.97226878,\n" +
            "      \"csupply\": \"745332143.00\",\n" +
            "      \"tsupply\": \"745332143.61\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"45985\",\n" +
            "      \"symbol\": \"CAKE\",\n" +
            "      \"name\": \"PancakeSwap\",\n" +
            "      \"nameid\": \"pancakeswap\",\n" +
            "      \"rank\": 60,\n" +
            "      \"price_usd\": \"4.45\",\n" +
            "      \"percent_change_24h\": \"1.64\",\n" +
            "      \"percent_change_1h\": \"0.48\",\n" +
            "      \"percent_change_7d\": \"-2.97\",\n" +
            "      \"price_btc\": \"0.000229\",\n" +
            "      \"market_cap_usd\": \"732463347.05\",\n" +
            "      \"volume24\": 26449341.233005174,\n" +
            "      \"volume24a\": 23394667.308818374,\n" +
            "      \"csupply\": \"164522446.00\",\n" +
            "      \"tsupply\": \"322626428.1705\",\n" +
            "      \"msupply\": \"750000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33391\",\n" +
            "      \"symbol\": \"BTTC\",\n" +
            "      \"name\": \"BitTorrent\",\n" +
            "      \"nameid\": \"bittorrent\",\n" +
            "      \"rank\": 61,\n" +
            "      \"price_usd\": \"7.75E-7\",\n" +
            "      \"percent_change_24h\": \"1.64\",\n" +
            "      \"percent_change_1h\": \"0.08\",\n" +
            "      \"percent_change_7d\": \"0.34\",\n" +
            "      \"price_btc\": \"3.99E-11\",\n" +
            "      \"market_cap_usd\": \"730116902.63\",\n" +
            "      \"volume24\": 10637734.014310958,\n" +
            "      \"volume24a\": 7646025.495449622,\n" +
            "      \"csupply\": \"942690250000000.00\",\n" +
            "      \"tsupply\": \"990000000000000\",\n" +
            "      \"msupply\": \"990000000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"51539\",\n" +
            "      \"symbol\": \"XEC\",\n" +
            "      \"name\": \"eCash\",\n" +
            "      \"nameid\": \"ecash\",\n" +
            "      \"rank\": 62,\n" +
            "      \"price_usd\": \"0.000037\",\n" +
            "      \"percent_change_24h\": \"2.38\",\n" +
            "      \"percent_change_1h\": \"0.03\",\n" +
            "      \"percent_change_7d\": \"-1.06\",\n" +
            "      \"price_btc\": \"1.91E-9\",\n" +
            "      \"market_cap_usd\": \"708020430.21\",\n" +
            "      \"volume24\": 5815921.606295044,\n" +
            "      \"volume24a\": 12825165.979929684,\n" +
            "      \"csupply\": \"19141067173303.00\",\n" +
            "      \"tsupply\": \"19141067173303\",\n" +
            "      \"msupply\": \"21000000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"447\",\n" +
            "      \"symbol\": \"MIOTA\",\n" +
            "      \"name\": \"IOTA\",\n" +
            "      \"nameid\": \"iota\",\n" +
            "      \"rank\": 63,\n" +
            "      \"price_usd\": \"0.247559\",\n" +
            "      \"percent_change_24h\": \"2.50\",\n" +
            "      \"percent_change_1h\": \"0.04\",\n" +
            "      \"percent_change_7d\": \"-1.10\",\n" +
            "      \"price_btc\": \"0.000013\",\n" +
            "      \"market_cap_usd\": \"688099006.19\",\n" +
            "      \"volume24\": 4370045.268544381,\n" +
            "      \"volume24a\": 3370637.4467318747,\n" +
            "      \"csupply\": \"2779530283.00\",\n" +
            "      \"tsupply\": \"2779530283\",\n" +
            "      \"msupply\": \"2779530283\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"133\",\n" +
            "      \"symbol\": \"NEO\",\n" +
            "      \"name\": \"Neo\",\n" +
            "      \"nameid\": \"neo\",\n" +
            "      \"rank\": 64,\n" +
            "      \"price_usd\": \"8.34\",\n" +
            "      \"percent_change_24h\": \"4.55\",\n" +
            "      \"percent_change_1h\": \"-0.49\",\n" +
            "      \"percent_change_7d\": \"5.56\",\n" +
            "      \"price_btc\": \"0.000430\",\n" +
            "      \"market_cap_usd\": \"588165741.16\",\n" +
            "      \"volume24\": 112328465.40867476,\n" +
            "      \"volume24a\": 30323124.69300135,\n" +
            "      \"csupply\": \"70538831.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48555\",\n" +
            "      \"symbol\": \"HBAR\",\n" +
            "      \"name\": \"Hedera Hashgraph\",\n" +
            "      \"nameid\": \"hedera-hashgraph\",\n" +
            "      \"rank\": 65,\n" +
            "      \"price_usd\": \"0.059103\",\n" +
            "      \"percent_change_24h\": \"0.99\",\n" +
            "      \"percent_change_1h\": \"-0.14\",\n" +
            "      \"percent_change_7d\": \"-3.49\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"569368186.43\",\n" +
            "      \"volume24\": 21490364.486076795,\n" +
            "      \"volume24a\": 14717203.307762545,\n" +
            "      \"csupply\": \"9633530220.00\",\n" +
            "      \"tsupply\": \"50000000000\",\n" +
            "      \"msupply\": \"50000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"42227\",\n" +
            "      \"symbol\": \"PAXG\",\n" +
            "      \"name\": \"PAX Gold\",\n" +
            "      \"nameid\": \"pax-gold\",\n" +
            "      \"rank\": 66,\n" +
            "      \"price_usd\": \"1643.18\",\n" +
            "      \"percent_change_24h\": \"-0.55\",\n" +
            "      \"percent_change_1h\": \"-0.07\",\n" +
            "      \"percent_change_7d\": \"0.16\",\n" +
            "      \"price_btc\": \"0.084698\",\n" +
            "      \"market_cap_usd\": \"558165776.25\",\n" +
            "      \"volume24\": 564240941.5637801,\n" +
            "      \"volume24a\": 585129538.0547521,\n" +
            "      \"csupply\": \"339687.00\",\n" +
            "      \"tsupply\": \"339687.165\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48561\",\n" +
            "      \"symbol\": \"GRT\",\n" +
            "      \"name\": \"The Graph\",\n" +
            "      \"nameid\": \"the-graph\",\n" +
            "      \"rank\": 67,\n" +
            "      \"price_usd\": \"0.080397\",\n" +
            "      \"percent_change_24h\": \"4.36\",\n" +
            "      \"percent_change_1h\": \"-0.03\",\n" +
            "      \"percent_change_7d\": \"-6.48\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"554735955.01\",\n" +
            "      \"volume24\": 11690236.036737233,\n" +
            "      \"volume24a\": 7142549.269696912,\n" +
            "      \"csupply\": \"6900000000.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"10057044431\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"42531\",\n" +
            "      \"symbol\": \"KLAY\",\n" +
            "      \"name\": \"Klaytn\",\n" +
            "      \"nameid\": \"klaytn\",\n" +
            "      \"rank\": 68,\n" +
            "      \"price_usd\": \"0.185695\",\n" +
            "      \"percent_change_24h\": \"22.81\",\n" +
            "      \"percent_change_1h\": \"0.45\",\n" +
            "      \"percent_change_7d\": \"30.48\",\n" +
            "      \"price_btc\": \"0.000010\",\n" +
            "      \"market_cap_usd\": \"554264743.35\",\n" +
            "      \"volume24\": 230510026.3888674,\n" +
            "      \"volume24a\": 41356832.95141534,\n" +
            "      \"csupply\": \"2984804479.00\",\n" +
            "      \"tsupply\": \"10782297980.8\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"69853\",\n" +
            "      \"symbol\": \"EVMOS\",\n" +
            "      \"name\": \"Evmos\",\n" +
            "      \"nameid\": \"evmos\",\n" +
            "      \"rank\": 69,\n" +
            "      \"price_usd\": \"2.05\",\n" +
            "      \"percent_change_24h\": \"2.08\",\n" +
            "      \"percent_change_1h\": \"-2.21\",\n" +
            "      \"percent_change_7d\": \"27.63\",\n" +
            "      \"price_btc\": \"0.000106\",\n" +
            "      \"market_cap_usd\": \"549443939.49\",\n" +
            "      \"volume24\": 1617892.458499636,\n" +
            "      \"volume24a\": 1256885.9051274976,\n" +
            "      \"csupply\": \"268522635.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32604\",\n" +
            "      \"symbol\": \"NEXO\",\n" +
            "      \"name\": \"Nexo\",\n" +
            "      \"nameid\": \"nexo\",\n" +
            "      \"rank\": 70,\n" +
            "      \"price_usd\": \"0.945366\",\n" +
            "      \"percent_change_24h\": \"3.56\",\n" +
            "      \"percent_change_1h\": \"0.01\",\n" +
            "      \"percent_change_7d\": \"8.17\",\n" +
            "      \"price_btc\": \"0.000049\",\n" +
            "      \"market_cap_usd\": \"529405172.97\",\n" +
            "      \"volume24\": 3359252.7048519766,\n" +
            "      \"volume24a\": 2938978.8055433445,\n" +
            "      \"csupply\": \"560000011.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33644\",\n" +
            "      \"symbol\": \"FTM\",\n" +
            "      \"name\": \"Fantom\",\n" +
            "      \"nameid\": \"fantom\",\n" +
            "      \"rank\": 71,\n" +
            "      \"price_usd\": \"0.206863\",\n" +
            "      \"percent_change_24h\": \"2.61\",\n" +
            "      \"percent_change_1h\": \"0.24\",\n" +
            "      \"percent_change_7d\": \"0.06\",\n" +
            "      \"price_btc\": \"0.000011\",\n" +
            "      \"market_cap_usd\": \"526468556.16\",\n" +
            "      \"volume24\": 53389130.2838027,\n" +
            "      \"volume24a\": 42255126.05699953,\n" +
            "      \"csupply\": \"2545006273.00\",\n" +
            "      \"tsupply\": \"2545006273\",\n" +
            "      \"msupply\": \"3175000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"42441\",\n" +
            "      \"symbol\": \"AR\",\n" +
            "      \"name\": \"Arweave\",\n" +
            "      \"nameid\": \"arweave\",\n" +
            "      \"rank\": 72,\n" +
            "      \"price_usd\": \"10.22\",\n" +
            "      \"percent_change_24h\": \"-2.82\",\n" +
            "      \"percent_change_1h\": \"-1.01\",\n" +
            "      \"percent_change_7d\": \"1.94\",\n" +
            "      \"price_btc\": \"0.000527\",\n" +
            "      \"market_cap_usd\": \"512027997.85\",\n" +
            "      \"volume24\": 12085135.832192434,\n" +
            "      \"volume24a\": 11329672.461895786,\n" +
            "      \"csupply\": \"50108502.00\",\n" +
            "      \"tsupply\": \"64598643\",\n" +
            "      \"msupply\": \"66000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"36447\",\n" +
            "      \"symbol\": \"RUNE\",\n" +
            "      \"name\": \"THORChain\",\n" +
            "      \"nameid\": \"thorchain\",\n" +
            "      \"rank\": 73,\n" +
            "      \"price_usd\": \"1.46\",\n" +
            "      \"percent_change_24h\": \"3.12\",\n" +
            "      \"percent_change_1h\": \"-0.19\",\n" +
            "      \"percent_change_7d\": \"-1.29\",\n" +
            "      \"price_btc\": \"0.000075\",\n" +
            "      \"market_cap_usd\": \"482990156.67\",\n" +
            "      \"volume24\": 17548879.895102963,\n" +
            "      \"volume24a\": 9308482.134927878,\n" +
            "      \"csupply\": \"330688061.00\",\n" +
            "      \"tsupply\": \"334937974.91479\",\n" +
            "      \"msupply\": \"500000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32893\",\n" +
            "      \"symbol\": \"PHB\",\n" +
            "      \"name\": \"Red Pulse Phoenix\",\n" +
            "      \"nameid\": \"red-pulse\",\n" +
            "      \"rank\": 74,\n" +
            "      \"price_usd\": \"0.579591\",\n" +
            "      \"percent_change_24h\": \"9.92\",\n" +
            "      \"percent_change_1h\": \"-0.39\",\n" +
            "      \"percent_change_7d\": \"0.14\",\n" +
            "      \"price_btc\": \"0.000030\",\n" +
            "      \"market_cap_usd\": \"480822388.85\",\n" +
            "      \"volume24\": 4102001.5985693773,\n" +
            "      \"volume24a\": 4836513.617199173,\n" +
            "      \"csupply\": \"829588687.00\",\n" +
            "      \"tsupply\": \"1362278592\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48581\",\n" +
            "      \"symbol\": \"CRV\",\n" +
            "      \"name\": \"Curve DAO Token\",\n" +
            "      \"nameid\": \"curve-dao-token\",\n" +
            "      \"rank\": 75,\n" +
            "      \"price_usd\": \"0.907936\",\n" +
            "      \"percent_change_24h\": \"6.41\",\n" +
            "      \"percent_change_1h\": \"0.26\",\n" +
            "      \"percent_change_7d\": \"11.33\",\n" +
            "      \"price_btc\": \"0.000047\",\n" +
            "      \"market_cap_usd\": \"477404649.01\",\n" +
            "      \"volume24\": 39103632.01015215,\n" +
            "      \"volume24a\": 28018795.732624106,\n" +
            "      \"csupply\": \"525813240.00\",\n" +
            "      \"tsupply\": \"1803239558.2368\",\n" +
            "      \"msupply\": \"3303030299\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"56821\",\n" +
            "      \"symbol\": \"ENS\",\n" +
            "      \"name\": \"Ethereum Name Service\",\n" +
            "      \"nameid\": \"ethereum-name-service\",\n" +
            "      \"rank\": 76,\n" +
            "      \"price_usd\": \"17.54\",\n" +
            "      \"percent_change_24h\": \"7.88\",\n" +
            "      \"percent_change_1h\": \"-0.09\",\n" +
            "      \"percent_change_7d\": \"-11.33\",\n" +
            "      \"price_btc\": \"0.000904\",\n" +
            "      \"market_cap_usd\": \"452174501.70\",\n" +
            "      \"volume24\": 52457420.35500287,\n" +
            "      \"volume24a\": 37460739.531247444,\n" +
            "      \"csupply\": \"25783233.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"44178\",\n" +
            "      \"symbol\": \"TWT\",\n" +
            "      \"name\": \"Trust Wallet Token\",\n" +
            "      \"nameid\": \"trust-wallet-token\",\n" +
            "      \"rank\": 77,\n" +
            "      \"price_usd\": \"1.07\",\n" +
            "      \"percent_change_24h\": \"-3.39\",\n" +
            "      \"percent_change_1h\": \"-0.13\",\n" +
            "      \"percent_change_7d\": \"3.41\",\n" +
            "      \"price_btc\": \"0.000055\",\n" +
            "      \"market_cap_usd\": \"445210460.20\",\n" +
            "      \"volume24\": 6731159.727661357,\n" +
            "      \"volume24a\": 3634245.5578066483,\n" +
            "      \"csupply\": \"416649900.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"8\",\n" +
            "      \"symbol\": \"DASH\",\n" +
            "      \"name\": \"Dash\",\n" +
            "      \"nameid\": \"dash\",\n" +
            "      \"rank\": 78,\n" +
            "      \"price_usd\": \"40.55\",\n" +
            "      \"percent_change_24h\": \"0.80\",\n" +
            "      \"percent_change_1h\": \"0.02\",\n" +
            "      \"percent_change_7d\": \"-2.80\",\n" +
            "      \"price_btc\": \"0.002090\",\n" +
            "      \"market_cap_usd\": \"443421126.48\",\n" +
            "      \"volume24\": 78339394.52190875,\n" +
            "      \"volume24a\": 69760293.97210109,\n" +
            "      \"csupply\": \"10935229.00\",\n" +
            "      \"tsupply\": \"10935229\",\n" +
            "      \"msupply\": \"18900000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"184\",\n" +
            "      \"symbol\": \"BAT\",\n" +
            "      \"name\": \"Basic Attention Token\",\n" +
            "      \"nameid\": \"basic-attention-token\",\n" +
            "      \"rank\": 79,\n" +
            "      \"price_usd\": \"0.276877\",\n" +
            "      \"percent_change_24h\": \"1.10\",\n" +
            "      \"percent_change_1h\": \"-0.15\",\n" +
            "      \"percent_change_7d\": \"-3.45\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"414422736.01\",\n" +
            "      \"volume24\": 27497909.564619906,\n" +
            "      \"volume24a\": 31645080.142530542,\n" +
            "      \"csupply\": \"1496776945.00\",\n" +
            "      \"tsupply\": \"1500000000\",\n" +
            "      \"msupply\": \"1500000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48569\",\n" +
            "      \"symbol\": \"STX\",\n" +
            "      \"name\": \"Stacks\",\n" +
            "      \"nameid\": \"stacks\",\n" +
            "      \"rank\": 80,\n" +
            "      \"price_usd\": \"0.303584\",\n" +
            "      \"percent_change_24h\": \"2.06\",\n" +
            "      \"percent_change_1h\": \"-0.06\",\n" +
            "      \"percent_change_7d\": \"0.92\",\n" +
            "      \"price_btc\": \"0.000016\",\n" +
            "      \"market_cap_usd\": \"403127885.71\",\n" +
            "      \"volume24\": 4111213.531633617,\n" +
            "      \"volume24a\": 8061003.366918113,\n" +
            "      \"csupply\": \"1327895097.00\",\n" +
            "      \"tsupply\": \"1352464600\",\n" +
            "      \"msupply\": \"1818000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"99\",\n" +
            "      \"symbol\": \"DCR\",\n" +
            "      \"name\": \"Decred\",\n" +
            "      \"nameid\": \"decred\",\n" +
            "      \"rank\": 81,\n" +
            "      \"price_usd\": \"26.77\",\n" +
            "      \"percent_change_24h\": \"3.62\",\n" +
            "      \"percent_change_1h\": \"0.03\",\n" +
            "      \"percent_change_7d\": \"1.90\",\n" +
            "      \"price_btc\": \"0.001380\",\n" +
            "      \"market_cap_usd\": \"385144768.02\",\n" +
            "      \"volume24\": 2716176.8117688033,\n" +
            "      \"volume24a\": 3342217.0055523887,\n" +
            "      \"csupply\": \"14384596.00\",\n" +
            "      \"tsupply\": \"14384596\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32334\",\n" +
            "      \"symbol\": \"ZIL\",\n" +
            "      \"name\": \"Zilliqa\",\n" +
            "      \"nameid\": \"zilliqa\",\n" +
            "      \"rank\": 82,\n" +
            "      \"price_usd\": \"0.029155\",\n" +
            "      \"percent_change_24h\": \"1.72\",\n" +
            "      \"percent_change_1h\": \"-0.19\",\n" +
            "      \"percent_change_7d\": \"-5.01\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"383734616.79\",\n" +
            "      \"volume24\": 22058723.383506566,\n" +
            "      \"volume24a\": 17926150.162634194,\n" +
            "      \"csupply\": \"13161874999.00\",\n" +
            "      \"tsupply\": \"16453342152.396\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32408\",\n" +
            "      \"symbol\": \"XDCE\",\n" +
            "      \"name\": \"XinFin Network\",\n" +
            "      \"nameid\": \"xinfin-network\",\n" +
            "      \"rank\": 83,\n" +
            "      \"price_usd\": \"0.030602\",\n" +
            "      \"percent_change_24h\": \"-1.22\",\n" +
            "      \"percent_change_1h\": \"-0.61\",\n" +
            "      \"percent_change_7d\": \"-3.70\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"374986812.48\",\n" +
            "      \"volume24\": 849985.29567974,\n" +
            "      \"volume24a\": 868981.0626199566,\n" +
            "      \"csupply\": \"12253720803.00\",\n" +
            "      \"tsupply\": \"12253720803.1\",\n" +
            "      \"msupply\": \"37629974945\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"64675\",\n" +
            "      \"symbol\": \"KAVA\",\n" +
            "      \"name\": \"Kava\",\n" +
            "      \"nameid\": \"kava\",\n" +
            "      \"rank\": 84,\n" +
            "      \"price_usd\": \"1.50\",\n" +
            "      \"percent_change_24h\": \"5.61\",\n" +
            "      \"percent_change_1h\": \"-0.09\",\n" +
            "      \"percent_change_7d\": \"6.36\",\n" +
            "      \"price_btc\": \"0.000077\",\n" +
            "      \"market_cap_usd\": \"372599248.89\",\n" +
            "      \"volume24\": 8229392.531211689,\n" +
            "      \"volume24a\": 7958440.024903714,\n" +
            "      \"csupply\": \"248712660.00\",\n" +
            "      \"tsupply\": \"251195097\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2581\",\n" +
            "      \"symbol\": \"ENJ\",\n" +
            "      \"name\": \"Enjin Coin\",\n" +
            "      \"nameid\": \"enjin-coin\",\n" +
            "      \"rank\": 85,\n" +
            "      \"price_usd\": \"0.415537\",\n" +
            "      \"percent_change_24h\": \"1.98\",\n" +
            "      \"percent_change_1h\": \"0.13\",\n" +
            "      \"percent_change_7d\": \"-2.98\",\n" +
            "      \"price_btc\": \"0.000021\",\n" +
            "      \"market_cap_usd\": \"372487645.11\",\n" +
            "      \"volume24\": 14649666.483199319,\n" +
            "      \"volume24a\": 11701285.756998507,\n" +
            "      \"csupply\": \"896399955.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48571\",\n" +
            "      \"symbol\": \"UST\",\n" +
            "      \"name\": \"TerraUSD\",\n" +
            "      \"nameid\": \"terrausd\",\n" +
            "      \"rank\": 86,\n" +
            "      \"price_usd\": \"0.036912\",\n" +
            "      \"percent_change_24h\": \"1.10\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"-2.74\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"362311401.57\",\n" +
            "      \"volume24\": 5275769.017814049,\n" +
            "      \"volume24a\": 5286117.200678523,\n" +
            "      \"csupply\": \"9815491951.00\",\n" +
            "      \"tsupply\": \"9815491951.3398\",\n" +
            "      \"msupply\": \"9815491951.3398\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"47304\",\n" +
            "      \"symbol\": \"COMP\",\n" +
            "      \"name\": \"Compound\",\n" +
            "      \"nameid\": \"compound\",\n" +
            "      \"rank\": 87,\n" +
            "      \"price_usd\": \"50.13\",\n" +
            "      \"percent_change_24h\": \"1.62\",\n" +
            "      \"percent_change_1h\": \"-0.01\",\n" +
            "      \"percent_change_7d\": \"-8.75\",\n" +
            "      \"price_btc\": \"0.002584\",\n" +
            "      \"market_cap_usd\": \"361155277.73\",\n" +
            "      \"volume24\": 14767948.402620597,\n" +
            "      \"volume24a\": 9329301.44472178,\n" +
            "      \"csupply\": \"7203906.00\",\n" +
            "      \"tsupply\": \"10000000\",\n" +
            "      \"msupply\": \"10000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"70413\",\n" +
            "      \"symbol\": \"USTC\",\n" +
            "      \"name\": \"TerraClassicUSD\",\n" +
            "      \"nameid\": \"terraclassicusd\",\n" +
            "      \"rank\": 88,\n" +
            "      \"price_usd\": \"0.036692\",\n" +
            "      \"percent_change_24h\": \"3.20\",\n" +
            "      \"percent_change_1h\": \"-0.49\",\n" +
            "      \"percent_change_7d\": \"-1.23\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"360152729.93\",\n" +
            "      \"volume24\": 47055900.68402138,\n" +
            "      \"volume24a\": 24116320.91709909,\n" +
            "      \"csupply\": \"9815491951.00\",\n" +
            "      \"tsupply\": null,\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"113\",\n" +
            "      \"symbol\": \"WAVES\",\n" +
            "      \"name\": \"Waves\",\n" +
            "      \"nameid\": \"waves\",\n" +
            "      \"rank\": 89,\n" +
            "      \"price_usd\": \"3.18\",\n" +
            "      \"percent_change_24h\": \"1.28\",\n" +
            "      \"percent_change_1h\": \"0.21\",\n" +
            "      \"percent_change_7d\": \"-9.99\",\n" +
            "      \"price_btc\": \"0.000164\",\n" +
            "      \"market_cap_usd\": \"347126548.25\",\n" +
            "      \"volume24\": 50682008.35216161,\n" +
            "      \"volume24a\": 36930742.578441024,\n" +
            "      \"csupply\": \"109048360.00\",\n" +
            "      \"tsupply\": \"109048360\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"48829\",\n" +
            "      \"symbol\": \"CVX\",\n" +
            "      \"name\": \"Convex Finance\",\n" +
            "      \"nameid\": \"convex-finance\",\n" +
            "      \"rank\": 90,\n" +
            "      \"price_usd\": \"5.14\",\n" +
            "      \"percent_change_24h\": \"2.09\",\n" +
            "      \"percent_change_1h\": \"0.39\",\n" +
            "      \"percent_change_7d\": \"-4.92\",\n" +
            "      \"price_btc\": \"0.000265\",\n" +
            "      \"market_cap_usd\": \"342367952.04\",\n" +
            "      \"volume24\": 2613947.2325829905,\n" +
            "      \"volume24a\": 2691470.4743513414,\n" +
            "      \"csupply\": \"66629241.00\",\n" +
            "      \"tsupply\": \"93697866.954237\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"70\",\n" +
            "      \"symbol\": \"XEM\",\n" +
            "      \"name\": \"NEM\",\n" +
            "      \"nameid\": \"nem\",\n" +
            "      \"rank\": 91,\n" +
            "      \"price_usd\": \"0.037464\",\n" +
            "      \"percent_change_24h\": \"0.61\",\n" +
            "      \"percent_change_1h\": \"0.08\",\n" +
            "      \"percent_change_7d\": \"-3.13\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"337175446.92\",\n" +
            "      \"volume24\": 5609755.523896198,\n" +
            "      \"volume24a\": 5078814.21095698,\n" +
            "      \"csupply\": \"8999999999.00\",\n" +
            "      \"tsupply\": \"8999999999\",\n" +
            "      \"msupply\": \"8999999999\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2781\",\n" +
            "      \"symbol\": \"LRC\",\n" +
            "      \"name\": \"Loopring\",\n" +
            "      \"nameid\": \"loopring\",\n" +
            "      \"rank\": 92,\n" +
            "      \"price_usd\": \"0.250582\",\n" +
            "      \"percent_change_24h\": \"1.30\",\n" +
            "      \"percent_change_1h\": \"0.16\",\n" +
            "      \"percent_change_7d\": \"-3.12\",\n" +
            "      \"price_btc\": \"0.000013\",\n" +
            "      \"market_cap_usd\": \"333304695.36\",\n" +
            "      \"volume24\": 23235339.18677681,\n" +
            "      \"volume24a\": 18737284.058285337,\n" +
            "      \"csupply\": \"1330119710.00\",\n" +
            "      \"tsupply\": \"1373873437.4425\",\n" +
            "      \"msupply\": \"1374513896\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32686\",\n" +
            "      \"symbol\": \"HOT\",\n" +
            "      \"name\": \"Holo\",\n" +
            "      \"nameid\": \"holo\",\n" +
            "      \"rank\": 93,\n" +
            "      \"price_usd\": \"0.001900\",\n" +
            "      \"percent_change_24h\": \"0.87\",\n" +
            "      \"percent_change_1h\": \"-0.14\",\n" +
            "      \"percent_change_7d\": \"-3.63\",\n" +
            "      \"price_btc\": \"9.79E-8\",\n" +
            "      \"market_cap_usd\": \"329355225.95\",\n" +
            "      \"volume24\": 2402353.2015714664,\n" +
            "      \"volume24a\": 2611705.7102892916,\n" +
            "      \"csupply\": \"173342974126.00\",\n" +
            "      \"tsupply\": \"177619433541.14\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33762\",\n" +
            "      \"symbol\": \"GUSD\",\n" +
            "      \"name\": \"Gemini Dollar\",\n" +
            "      \"nameid\": \"gemini-dollar\",\n" +
            "      \"rank\": 94,\n" +
            "      \"price_usd\": \"0.997357\",\n" +
            "      \"percent_change_24h\": \"-0.07\",\n" +
            "      \"percent_change_1h\": \"0.00\",\n" +
            "      \"percent_change_7d\": \"0.00\",\n" +
            "      \"price_btc\": \"0.000051\",\n" +
            "      \"market_cap_usd\": \"325838953.94\",\n" +
            "      \"volume24\": 2845993.708993802,\n" +
            "      \"volume24a\": 1817434.5925880743,\n" +
            "      \"csupply\": \"326702267.00\",\n" +
            "      \"tsupply\": \"326702267.76\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"46966\",\n" +
            "      \"symbol\": \"1INCH\",\n" +
            "      \"name\": \"1inch\",\n" +
            "      \"nameid\": \"1inch\",\n" +
            "      \"rank\": 95,\n" +
            "      \"price_usd\": \"0.569539\",\n" +
            "      \"percent_change_24h\": \"1.63\",\n" +
            "      \"percent_change_1h\": \"-0.30\",\n" +
            "      \"percent_change_7d\": \"0.22\",\n" +
            "      \"price_btc\": \"0.000029\",\n" +
            "      \"market_cap_usd\": \"325639099.59\",\n" +
            "      \"volume24\": 24797553.023699827,\n" +
            "      \"volume24a\": 16802459.175748635,\n" +
            "      \"csupply\": \"571759066.00\",\n" +
            "      \"tsupply\": \"1500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"44425\",\n" +
            "      \"symbol\": \"CELO\",\n" +
            "      \"name\": \"Celo\",\n" +
            "      \"nameid\": \"celo\",\n" +
            "      \"rank\": 96,\n" +
            "      \"price_usd\": \"0.710589\",\n" +
            "      \"percent_change_24h\": \"0.70\",\n" +
            "      \"percent_change_1h\": \"-0.05\",\n" +
            "      \"percent_change_7d\": \"-5.17\",\n" +
            "      \"price_btc\": \"0.000037\",\n" +
            "      \"market_cap_usd\": \"324462813.06\",\n" +
            "      \"volume24\": 3548876.239774687,\n" +
            "      \"volume24a\": 3740242.2412669035,\n" +
            "      \"csupply\": \"456611349.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32386\",\n" +
            "      \"symbol\": \"RVN\",\n" +
            "      \"name\": \"Ravencoin\",\n" +
            "      \"nameid\": \"ravencoin\",\n" +
            "      \"rank\": 97,\n" +
            "      \"price_usd\": \"0.030955\",\n" +
            "      \"percent_change_24h\": \"-0.10\",\n" +
            "      \"percent_change_1h\": \"-0.11\",\n" +
            "      \"percent_change_7d\": \"0.00\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"324204866.36\",\n" +
            "      \"volume24\": 11264412.150469087,\n" +
            "      \"volume24a\": 10125849.454593733,\n" +
            "      \"csupply\": \"10473290000.00\",\n" +
            "      \"tsupply\": \"10473290000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"44699\",\n" +
            "      \"symbol\": \"DFI\",\n" +
            "      \"name\": \"DeFiChain\",\n" +
            "      \"nameid\": \"defichain\",\n" +
            "      \"rank\": 98,\n" +
            "      \"price_usd\": \"0.624946\",\n" +
            "      \"percent_change_24h\": \"1.54\",\n" +
            "      \"percent_change_1h\": \"0.78\",\n" +
            "      \"percent_change_7d\": \"-2.26\",\n" +
            "      \"price_btc\": \"0.000032\",\n" +
            "      \"market_cap_usd\": \"319183967.83\",\n" +
            "      \"volume24\": 867380.5015127287,\n" +
            "      \"volume24a\": 543894.6235466454,\n" +
            "      \"csupply\": \"510738160.00\",\n" +
            "      \"tsupply\": \"784881510.35644\",\n" +
            "      \"msupply\": \"1200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"62645\",\n" +
            "      \"symbol\": \"MINA\",\n" +
            "      \"name\": \"Mina Protocol\",\n" +
            "      \"nameid\": \"mina-protocol\",\n" +
            "      \"rank\": 99,\n" +
            "      \"price_usd\": \"0.530217\",\n" +
            "      \"percent_change_24h\": \"-1.78\",\n" +
            "      \"percent_change_1h\": \"-0.63\",\n" +
            "      \"percent_change_7d\": \"-2.54\",\n" +
            "      \"price_btc\": \"0.000027\",\n" +
            "      \"market_cap_usd\": \"312041863.40\",\n" +
            "      \"volume24\": 9213754.014503552,\n" +
            "      \"volume24a\": 4678735.891432767,\n" +
            "      \"csupply\": \"588516938.00\",\n" +
            "      \"tsupply\": \"944454412.84004\",\n" +
            "      \"msupply\": \"944454412.84004\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"285\",\n" +
            "      \"symbol\": \"BTG\",\n" +
            "      \"name\": \"Bitcoin Gold\",\n" +
            "      \"nameid\": \"bitcoingold\",\n" +
            "      \"rank\": 100,\n" +
            "      \"price_usd\": \"18.04\",\n" +
            "      \"percent_change_24h\": \"-12.22\",\n" +
            "      \"percent_change_1h\": \"-0.36\",\n" +
            "      \"percent_change_7d\": \"0.44\",\n" +
            "      \"price_btc\": \"0.000930\",\n" +
            "      \"market_cap_usd\": \"311179140.88\",\n" +
            "      \"volume24\": 19973237.599972412,\n" +
            "      \"volume24a\": 79250723.13094722,\n" +
            "      \"csupply\": \"17248611.00\",\n" +
            "      \"tsupply\": \"17348611\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"info\": {\n" +
            "    \"coins_num\": 9457,\n" +
            "    \"time\": 1666611542\n" +
            "  }\n" +
            "}";
}
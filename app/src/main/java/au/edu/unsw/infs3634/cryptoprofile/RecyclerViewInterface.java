package au.edu.unsw.infs3634.cryptoprofile;

import au.edu.unsw.infs3634.cryptoprofile.api.Coin;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.text.NumberFormat;
import java.util.ArrayList;


class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CoinViewHolder> implements Filterable{
    private final ArrayList<Coin> mCoins;
    private ArrayList<Coin> mCoinsFiltered;
    private final RecyclerViewClickListener mListener;
    public static final int sortingMethodName = 1;
    public static final int sortingMethodValue = 2;

    public RecyclerViewAdapter(ArrayList<Coin> coins, RecyclerViewClickListener listener) {
        mCoins = coins;
        mCoinsFiltered = coins;
        mListener = listener;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence filterQuery) {
                String filterString = filterQuery.toString();

                if (filterString.isEmpty()) {
                    mCoinsFiltered = mCoins;
                } else {
                    ArrayList<Coin> filteredList = new ArrayList<>();
                    for (Coin coin : mCoins) {
                        if (coin.getName().toLowerCase().contains(filterString.toLowerCase())) {
                            filteredList.add(coin);
                        }
                    }
                    mCoinsFiltered = filteredList;
                }

                FilterResults result = new FilterResults();
                result.values = mCoinsFiltered;
                return result;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mCoinsFiltered = (ArrayList<Coin>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, String coinSymbol);
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.CoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View recyclerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new CoinViewHolder(recyclerView, mListener);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.CoinViewHolder holder, int position) {
        Coin coin = mCoinsFiltered.get(position);

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        holder.name.setText(coin.getName());
        holder.value.setText(formatter.format(Double.valueOf(coin.getPriceUsd())));
        String percentChange1h = coin.getPercentChange1h() + " %" ;
        holder.change1h.setText(percentChange1h);
        holder.itemView.setTag(coin.getSymbol());

    }

    @Override
    public int getItemCount() {
        return mCoinsFiltered.size();
    }

    public static class CoinViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public TextView value;
        public TextView change1h;
        private final RecyclerViewClickListener mListener;

        public CoinViewHolder(@NonNull View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            mListener = listener;
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.tvName);
            value = itemView.findViewById(R.id.tvValue);
            change1h = itemView.findViewById(R.id.tvChange);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, (String) view.getTag());
        }
    }

    public void sort(final int sortMethod) {
        if (mCoinsFiltered.size() > 0) {
            mCoinsFiltered.sort((coin1, coin2) -> {
                if (sortMethod == sortingMethodName) {
                    return coin1.getName().compareTo(coin2.getName());
                } else if (sortMethod == sortingMethodValue) {
                    return Double.valueOf(coin1.getPriceUsd()).compareTo(Double.valueOf(coin2.getPriceUsd()));
                }
                return coin1.getName().compareTo(coin2.getName());
            });
        }
        notifyDataSetChanged();
    }
}

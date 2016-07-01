package retrofit.aishwarya.com.sampleretrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit.aishwarya.com.sampleretrofit.R;
import retrofit.aishwarya.com.sampleretrofit.model.ProductionCompanies;

/**
 * Created by aishwarya on 23/6/16.
 */
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {
    private ArrayList<ProductionCompanies> mProductionCompanies = new ArrayList<>();



    public MoviesAdapter(ArrayList<ProductionCompanies> productionCompanies) {
        mProductionCompanies = productionCompanies;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                                                        .inflate(R.layout.item_layout, parent, false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ProductionCompanies productionCompanies = mProductionCompanies.get(position);
        holder.mMovieName.setText(productionCompanies.getName());
        //holder.mId.setText(productionCompanies.getId());
    }

    @Override
    public int getItemCount() {
        return mProductionCompanies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mMovieName;
      //  public TextView mId;

        public ViewHolder(View itemView) {
            super(itemView);
            mMovieName = (TextView) itemView.findViewById(R.id.movie_name);
           // mId = (TextView) itemView.findViewById(R.id.movie_id);
        }
    }
}

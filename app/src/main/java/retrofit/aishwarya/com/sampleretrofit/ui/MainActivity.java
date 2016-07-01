package retrofit.aishwarya.com.sampleretrofit.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit.aishwarya.com.sampleretrofit.R;
import retrofit.aishwarya.com.sampleretrofit.adapter.MoviesAdapter;
import retrofit.aishwarya.com.sampleretrofit.model.MovieResponse;
import retrofit.aishwarya.com.sampleretrofit.model.ProductionCompanies;
import retrofit.aishwarya.com.sampleretrofit.rest.ApiClient;
import retrofit.aishwarya.com.sampleretrofit.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private final static String API_KEY = "5430d535b4bc82c87c7e623d7e3ac62d";
    private ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressDialog   = new ProgressDialog(this);
        findViewById(R.id.get_movie_names).setOnClickListener(this);
    }

    private void makeApiCall() {
        mProgressDialog.show();
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<MovieResponse> call = apiService.getTopRatedMovies(API_KEY);
        Log.d(TAG, "URL:" +call.toString());
        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                    if (response != null && call != null) {
                        mProgressDialog.dismiss();
                        Log.d(TAG, "Response Code:" +response.code());
                        if (response.isSuccessful()) {
                            Log.d(TAG, "onSuccess():");
                            handleSuccessOfQueryingMovieDb(response);
                        }

                    }
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
                mProgressDialog.dismiss();
                Log.d(TAG, "onFailure():" +t.getMessage());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void handleSuccessOfQueryingMovieDb(Response<MovieResponse> response) {
        MovieResponse movieResponse  = response.body();
        if (movieResponse != null) {
            ArrayList<ProductionCompanies> productionCompanies = (ArrayList<ProductionCompanies>) movieResponse
                    .getProductionCompanies();
            if (productionCompanies != null) {
                Log.d(TAG, "MOVIE:" +productionCompanies.size());
                showReqdDataInRecyclerView(productionCompanies);
            }
        }
    }

    private void showReqdDataInRecyclerView(ArrayList<ProductionCompanies> productionCompanies) {
        RecyclerView movieRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        if (movieRecyclerView != null) {
            movieRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            MoviesAdapter moviesAdapter = new MoviesAdapter(productionCompanies);
            movieRecyclerView.setAdapter(moviesAdapter);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.get_movie_names) {
            makeApiCall();
        }
    }
}

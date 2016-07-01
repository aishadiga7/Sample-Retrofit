package retrofit.aishwarya.com.sampleretrofit.rest;

import retrofit.aishwarya.com.sampleretrofit.model.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aishwarya on 23/6/16.
 */
public interface ApiInterface {
    @GET("movie/550")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}

package za.ac.cput.covidtracker.News;

import android.content.Context;
import android.telecom.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RequestManager {
    //Declaring the context variable
    Context context;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public void getNewsHeadLines (OnfetchDataListener listener, String category, String query){
        CallNewsApi callNewsApi = retrofit.create(new CallNewsApi.class);
        Call<NewsApiResponse> call = callNewsApi.callHeadlines("sa", category, query, context.getString(R.string.api_key))
    }

    public RequestManager(Context context) {
        this.context = context;
    }

    public interface CallNewsApi{
        @GET("top-headlines")
        Call<NewsApiResponse> callHeadlines(
                @Query("country") String country,
                @Query("category") String category,
                @Query ("q") String query,
                @Query ("apikey") String api_key
        );
        
    }
}

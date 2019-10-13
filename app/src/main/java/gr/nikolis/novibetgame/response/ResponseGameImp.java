package gr.nikolis.novibetgame.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gr.nikolis.novibetgame.api.Api;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResponseGameImp extends ResponseGame {
    private static final String BASE_URL = "http://www.mocky.io/v2/";

    @Override
    public Api getApi() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(Api.class);
    }
}

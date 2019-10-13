package gr.nikolis.novibetgame.api;

import java.util.List;

import gr.nikolis.novibetgame.models.Login;
import gr.nikolis.novibetgame.models.User;
import gr.nikolis.novibetgame.models.game.Game;
import gr.nikolis.novibetgame.models.headlines.HeadLine;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Api {

    @POST("5d8e4bd9310000a2612b5448")
    Call<User> login(@Body Login login);

    @GET("secretinfo")
    Call<ResponseBody> getSecret(@Header("Authorization") String authorization);

    @GET("5d7113513300000b2177973a")
    Call<List<Game>> getGames(@Header("Authorization") String authorization);

    @GET("5d7113ef3300000e00779746")
    Call<List<HeadLine>> getHeadLines(@Header("Authorization") String authorization);

    @GET("5d7114b2330000112177974d")
    Call<List<Game>> getGamesUpdate(@Header("Authorization") String authorization);

    @GET("5d711461330000d135779748")
    Call<List<HeadLine>> getHeadlinesUpdate(@Header("Authorization") String authorization);
}

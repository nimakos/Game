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

    @POST("login")
    Call<User> login(@Body Login login);

    @GET("secretinfo")
    Call<ResponseBody> getSecret(@Header("Authorization") String authorization);

    @GET("games")
    Call<List<Game>> getGames(@Header("Authorization") String authorization);

    @GET("headlines")
    Call<List<HeadLine>> getHeadLines(@Header("Authorization") String authorization);

    @GET("gamesupdate")
    Call<List<Game>> getGamesUpdate(@Header("Authorization") String authorization);

    @GET("headlinesupdate")
    Call<List<HeadLine>> getHeadlinesUpdate(@Header("Authorization") String authorization);
}

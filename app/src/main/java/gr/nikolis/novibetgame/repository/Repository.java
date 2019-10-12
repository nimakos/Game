package gr.nikolis.novibetgame.repository;

import java.util.List;

import gr.nikolis.novibetgame.models.Login;
import gr.nikolis.novibetgame.models.game.Game;
import gr.nikolis.novibetgame.models.headlines.HeadLine;
import gr.nikolis.novibetgame.observers.OnGameResponse;
import gr.nikolis.novibetgame.observers.OnGameUpdateResponse;
import gr.nikolis.novibetgame.observers.OnHeadLineResponse;
import gr.nikolis.novibetgame.observers.OnHeadLineUpdateResponse;
import gr.nikolis.novibetgame.observers.OnLoginResponse;
import gr.nikolis.novibetgame.models.User;
import gr.nikolis.novibetgame.api.Api;
import gr.nikolis.novibetgame.response.ResponseGame;
import gr.nikolis.novibetgame.threads.DefaultExecutorSupplier;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private Api api;

    public Repository() {
        api = ResponseGame.getInstance().getApi();
    }

    public void login(Login login, OnLoginResponse loginResponse) {
        User user = new User();
        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(() -> api.login(login)
                .enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            user.setToken(response.body().getToken());
                            user.setType(response.body().getType());
                            user.setValidated(true);
                            setSecret(response.body().getToken());
                            loginResponse.OnSuccess(user);
                        }
                        else {
                            loginResponse.OnError(user);
                            user.setValidated(false);
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        loginResponse.OnError(user);
                        user.setValidated(false);
                    }
                }));
    }

    private void setSecret(String token) {
        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(() -> api.getSecret(token)
                .enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                }));
    }

    public void getGames(String authentication, OnGameResponse onGameResponse) {
        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(() -> api.getGames(authentication)
                .enqueue(new Callback<List<Game>>() {
                    @Override
                    public void onResponse(Call<List<Game>> call, Response<List<Game>> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            onGameResponse.onGameSuccess(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Game>> call, Throwable t) {
                        onGameResponse.onGameError(t);
                    }
                }));
    }

    public void getHeadLines(String authentication, OnHeadLineResponse onHeadLineResponse) {
        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(() -> api.getHeadLines(authentication)
                .enqueue(new Callback<List<HeadLine>>() {
                    @Override
                    public void onResponse(Call<List<HeadLine>> call, Response<List<HeadLine>> response) {
                        onHeadLineResponse.onHeadLineSuccess(response.body());
                    }

                    @Override
                    public void onFailure(Call<List<HeadLine>> call, Throwable t) {
                        onHeadLineResponse.onHeadLineGameError(t);
                    }
                }));
    }

    public void getGameUpdates(String authentication, OnGameUpdateResponse onGameUpdateResponse) {
        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(() -> api.getGamesUpdate(authentication)
                .enqueue(new Callback<List<Game>>() {
                    @Override
                    public void onResponse(Call<List<Game>> call, Response<List<Game>> response) {
                        onGameUpdateResponse.onGameUpdateSuccess(response.body());
                    }

                    @Override
                    public void onFailure(Call<List<Game>> call, Throwable t) {
                        onGameUpdateResponse.onGameUpdateError(t);
                    }
                }));
    }

    public void getHeadLinesUpdate(String authentication, OnHeadLineUpdateResponse onHeadLineUpdateResponse) {
        DefaultExecutorSupplier.getInstance().forBackgroundTasks().execute(() -> api.getHeadlinesUpdate(authentication)
                .enqueue(new Callback<List<HeadLine>>() {
                    @Override
                    public void onResponse(Call<List<HeadLine>> call, Response<List<HeadLine>> response) {
                        onHeadLineUpdateResponse.onHeadLineUpdateSuccess(response.body());
                    }

                    @Override
                    public void onFailure(Call<List<HeadLine>> call, Throwable t) {
                        onHeadLineUpdateResponse.onHeadLineUpdateGameError(t);
                    }
                }));
    }
}

package gr.nikolis.novibetgame.observers;

import java.util.List;

import gr.nikolis.novibetgame.models.goal.Games;

public interface OnGameResponse {

    void onGameSuccess(List<Games> games);

    void onGameError(Throwable t);
}

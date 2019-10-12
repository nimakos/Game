package gr.nikolis.novibetgame.observers;

import java.util.List;

import gr.nikolis.novibetgame.models.goal.Games;

public interface OnGameUpdateResponse {

    void onGameUpdateSuccess(List<Games> games);

    void onGameUpdateError(Throwable t);
}

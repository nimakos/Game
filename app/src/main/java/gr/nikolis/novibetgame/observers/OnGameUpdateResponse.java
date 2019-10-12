package gr.nikolis.novibetgame.observers;

import java.util.List;

import gr.nikolis.novibetgame.models.game.Game;

public interface OnGameUpdateResponse {

    void onGameUpdateSuccess(List<Game> games);

    void onGameUpdateError(Throwable t);
}

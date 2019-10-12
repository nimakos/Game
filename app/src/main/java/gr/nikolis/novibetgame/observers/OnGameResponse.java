package gr.nikolis.novibetgame.observers;

import java.util.List;

import gr.nikolis.novibetgame.models.game.Game;

public interface OnGameResponse {

    void onGameSuccess(List<Game> games);

    void onGameError(Throwable t);
}

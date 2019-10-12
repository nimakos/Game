package gr.nikolis.novibetgame.observers;

import java.util.List;

import gr.nikolis.novibetgame.models.headlines.HeadLine;

public interface OnHeadLineResponse {

    void onHeadLineSuccess(List<HeadLine> games);

    void onHeadLineGameError(Throwable t);
}

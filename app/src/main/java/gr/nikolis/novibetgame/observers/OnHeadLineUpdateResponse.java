package gr.nikolis.novibetgame.observers;

import java.util.List;

import gr.nikolis.novibetgame.models.headlines.HeadLine;

public interface OnHeadLineUpdateResponse {

    void onHeadLineUpdateSuccess(List<HeadLine> games);

    void onHeadLineUpdateGameError(Throwable t);
}

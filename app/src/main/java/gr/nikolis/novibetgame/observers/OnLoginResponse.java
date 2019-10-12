package gr.nikolis.novibetgame.observers;

import gr.nikolis.novibetgame.models.User;

public interface OnLoginResponse {
    void OnSuccess(User user);
    void OnError(User user);
}

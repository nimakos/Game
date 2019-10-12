package gr.nikolis.novibetgame.response;


import gr.nikolis.novibetgame.api.Api;

public abstract class ResponseGame {

    private static ResponseGame INSTANCE;
    public abstract Api getApi();

    public static ResponseGame getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ResponseGameImp();
        return INSTANCE;
    }
}

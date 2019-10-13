package gr.nikolis.novibetgame.models.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Market {

    @SerializedName("marketId")
    @Expose
    private long marketId;

    @SerializedName("betTypeSysname")
    @Expose
    private String betTypeSysname;

    @SerializedName("betItems")
    @Expose
    private List<BetItem> betItems;


    public long getMarketId() {
        return marketId;
    }

    public void setMarketId(long marketId) {
        this.marketId = marketId;
    }

    public String getBetTypeSysname() {
        return betTypeSysname;
    }

    public void setBetTypeSysname(String betTypeSysname) {
        this.betTypeSysname = betTypeSysname;
    }

    public List<BetItem> getBetItems() {
        return betItems;
    }

    public void setBetItems(List<BetItem> betItems) {
        this.betItems = betItems;
    }
}

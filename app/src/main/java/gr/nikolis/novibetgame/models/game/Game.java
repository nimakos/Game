package gr.nikolis.novibetgame.models.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Game {

    @SerializedName("betViews")
    @Expose
    private List<BetView> betViews;

    @SerializedName("hasHighlights")
    @Expose
    private boolean hasHighlights;

    @SerializedName("totalCount")
    @Expose
    private int totalCount;

    @SerializedName("caption")
    @Expose
    private String caption;

    @SerializedName("marketViewType")
    @Expose
    private String marketViewType;

    @SerializedName("marketViewKey")
    @Expose
    private String marketViewKey;

    @SerializedName("modelType")
    @Expose
    private String modelType;

    public List<BetView> getBetViews() {
        return betViews;
    }

    public void setBetViews(List<BetView> betViews) {
        this.betViews = betViews;
    }

    public boolean isHasHighlights() {
        return hasHighlights;
    }

    public void setHasHighlights(boolean hasHighlights) {
        this.hasHighlights = hasHighlights;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getMarketViewType() {
        return marketViewType;
    }

    public void setMarketViewType(String marketViewType) {
        this.marketViewType = marketViewType;
    }

    public String getMarketViewKey() {
        return marketViewKey;
    }

    public void setMarketViewKey(String marketViewKey) {
        this.marketViewKey = marketViewKey;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }
}

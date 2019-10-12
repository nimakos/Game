package gr.nikolis.novibetgame.models.headlines;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HeadLine {

    @SerializedName("betViews")
    @Expose
    private List<BetView> betViews;

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

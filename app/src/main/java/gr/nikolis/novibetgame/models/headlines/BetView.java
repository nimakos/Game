package gr.nikolis.novibetgame.models.headlines;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BetView {

    @SerializedName("betContextId")
    @Expose
    private int betContextId;

    @SerializedName("marketViewGroupId")
    @Expose
    private int marketViewGroupId;

    @SerializedName("marketViewId")
    @Expose
    private int marketViewId;

    @SerializedName("rootMarketViewGroupId")
    @Expose
    private int rootMarketViewGroupId;

    @SerializedName("path")
    @Expose
    private String path;

    @SerializedName("startTime")
    @Expose
    private String startTime;

    @SerializedName("competitor1Caption")
    @Expose
    private String competitor1Caption;

    @SerializedName("competitor2Caption")
    @Expose
    private String competitor2Caption;

    @SerializedName("liveData")
    @Expose
    private String liveData;

    @SerializedName("displayFormat")
    @Expose
    private String displayFormat;

    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("imageId")
    @Expose
    private int imageId;

    @SerializedName("betViewKey")
    @Expose
    private String betViewKey;

    @SerializedName("modelType")
    @Expose
    private String modelType;

    public int getBetContextId() {
        return betContextId;
    }

    public void setBetContextId(int betContextId) {
        this.betContextId = betContextId;
    }

    public int getMarketViewGroupId() {
        return marketViewGroupId;
    }

    public void setMarketViewGroupId(int marketViewGroupId) {
        this.marketViewGroupId = marketViewGroupId;
    }

    public int getMarketViewId() {
        return marketViewId;
    }

    public void setMarketViewId(int marketViewId) {
        this.marketViewId = marketViewId;
    }

    public int getRootMarketViewGroupId() {
        return rootMarketViewGroupId;
    }

    public void setRootMarketViewGroupId(int rootMarketViewGroupId) {
        this.rootMarketViewGroupId = rootMarketViewGroupId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCompetitor1Caption() {
        return competitor1Caption;
    }

    public void setCompetitor1Caption(String competitor1Caption) {
        this.competitor1Caption = competitor1Caption;
    }

    public String getCompetitor2Caption() {
        return competitor2Caption;
    }

    public void setCompetitor2Caption(String competitor2Caption) {
        this.competitor2Caption = competitor2Caption;
    }

    public String getLiveData() {
        return liveData;
    }

    public void setLiveData(String liveData) {
        this.liveData = liveData;
    }

    public String getDisplayFormat() {
        return displayFormat;
    }

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getBetViewKey() {
        return betViewKey;
    }

    public void setBetViewKey(String betViewKey) {
        this.betViewKey = betViewKey;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }
}

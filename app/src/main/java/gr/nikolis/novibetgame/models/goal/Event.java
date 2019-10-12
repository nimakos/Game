package gr.nikolis.novibetgame.models.goal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("betContextId")
    @Expose
    private int betContextId;

    @SerializedName("path")
    @Expose
    private String path;

    @SerializedName("isHighlighted")
    @Expose
    private boolean isHighlighted;

    @SerializedName("additionalCaptions")
    @Expose
    private AdditionalCaptions additionalCaptions;

    @SerializedName("liveData")
    @Expose
    private LiveData liveData;

    @SerializedName("hasBetContextInfo")
    @Expose
    private boolean hasBetContextInfo;

    public int getBetContextId() {
        return betContextId;
    }

    public void setBetContextId(int betContextId) {
        this.betContextId = betContextId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }

    public void setHighlighted(boolean highlighted) {
        isHighlighted = highlighted;
    }

    public AdditionalCaptions getAdditionalCaptions() {
        return additionalCaptions;
    }

    public void setAdditionalCaptions(AdditionalCaptions additionalCaptions) {
        this.additionalCaptions = additionalCaptions;
    }

    public LiveData getLiveData() {
        return liveData;
    }

    public void setLiveData(LiveData liveData) {
        this.liveData = liveData;
    }

    public boolean isHasBetContextInfo() {
        return hasBetContextInfo;
    }

    public void setHasBetContextInfo(boolean hasBetContextInfo) {
        this.hasBetContextInfo = hasBetContextInfo;
    }
}

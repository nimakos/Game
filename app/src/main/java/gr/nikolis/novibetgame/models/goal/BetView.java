package gr.nikolis.novibetgame.models.goal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BetView {

    @SerializedName("competitionContextCaption")
    @Expose
    private String competitionContextCaption;

    @SerializedName("competitions")
    @Expose
    private List<Competition> competitions;

    @SerializedName("totalCount")
    @Expose
    private int totalCount;

    @SerializedName("betViewKey")
    @Expose
    private String betViewKey;

    @SerializedName("modelType")
    @Expose
    private String modelType;

    public String getCompetitionContextCaption() {
        return competitionContextCaption;
    }

    public void setCompetitionContextCaption(String competitionContextCaption) {
        this.competitionContextCaption = competitionContextCaption;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
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

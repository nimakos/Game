package gr.nikolis.novibetgame.models.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Competition {

    @SerializedName("betContextId")
    @Expose
    private int betContextId;

    @SerializedName("caption")
    @Expose
    private String caption;

    @SerializedName("regionCaption")
    @Expose
    private String regionCaption;

    @SerializedName("events")
    @Expose
    private List<Event> events;

    public int getBetContextId() {
        return betContextId;
    }

    public void setBetContextId(int betContextId) {
        this.betContextId = betContextId;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getRegionCaption() {
        return regionCaption;
    }

    public void setRegionCaption(String regionCaption) {
        this.regionCaption = regionCaption;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}

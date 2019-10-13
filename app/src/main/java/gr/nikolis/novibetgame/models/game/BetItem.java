package gr.nikolis.novibetgame.models.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BetItem {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("code")
    @Expose
    private String code;

    @SerializedName("instanceCaption")
    @Expose
    private String instanceCaption;

    @SerializedName("price")
    @Expose
    private double prise;

    @SerializedName("oddsText")
    @Expose
    private String oddsText;

    @SerializedName("isAvailable")
    @Expose
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInstanceCaption() {
        return instanceCaption;
    }

    public void setInstanceCaption(String instanceCaption) {
        this.instanceCaption = instanceCaption;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getOddsText() {
        return oddsText;
    }

    public void setOddsText(String oddsText) {
        this.oddsText = oddsText;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

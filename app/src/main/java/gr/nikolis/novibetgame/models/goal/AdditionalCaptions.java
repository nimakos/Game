package gr.nikolis.novibetgame.models.goal;

public class AdditionalCaptions {
    private int type;
    private String competitor1;
    private int competitor1ImageId;
    private String competitor2;
    private int competitor2ImageId;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCompetitor1() {
        return competitor1;
    }

    public void setCompetitor1(String competitor1) {
        this.competitor1 = competitor1;
    }

    public int getCompetitor1ImageId() {
        return competitor1ImageId;
    }

    public void setCompetitor1ImageId(int competitor1ImageId) {
        this.competitor1ImageId = competitor1ImageId;
    }

    public String getCompetitor2() {
        return competitor2;
    }

    public void setCompetitor2(String competitor2) {
        this.competitor2 = competitor2;
    }

    public int getCompetitor2ImageId() {
        return competitor2ImageId;
    }

    public void setCompetitor2ImageId(int competitor2ImageId) {
        this.competitor2ImageId = competitor2ImageId;
    }
}

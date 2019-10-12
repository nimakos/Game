package gr.nikolis.novibetgame.models;

public class FinalObject {

    private String competitor1;
    private String competitor2;
    private int homeGoals;
    private int awayGoals;
    private String elapsed;
    private String competitor1Caption;
    private String competitor2Caption;
    private String startTime;
    private int view;


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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCompetitor1() {
        return competitor1;
    }

    public void setCompetitor1(String competitor1) {
        this.competitor1 = competitor1;
    }

    public String getCompetitor2() {
        return competitor2;
    }

    public void setCompetitor2(String competitor2) {
        this.competitor2 = competitor2;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public String getElapsed() {
        return elapsed;
    }

    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}

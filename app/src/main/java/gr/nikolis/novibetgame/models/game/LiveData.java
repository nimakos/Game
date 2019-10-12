package gr.nikolis.novibetgame.models.game;

import java.util.Date;

public class LiveData {
    private int homeGoals;
    private int awayGoals;
    private int homeCorners;
    private int awayCorners;
    private int homeYellowCards;
    private int awayYellowCards;
    private int homeRedCards;
    private int awayRedCards;
    private int homePenaltyKicks;
    private int awayPenaltyKicks;
    private boolean supportsAchievements;
    private String liveStreamingCountries;
    private String sportradarMatchId;
    private Date referenceTime;
    private long referenceTimeUnix;
    private String elapsed;
    private double elapsedSeconds;
    private int duration;
    private int durationSeconds;
    private int timeToNextPhase;
    private int timeToNextPhaseSeconds;
    private String phaseSysname;
    private String phaseCaption;
    private String phaseCaptionLong;
    private boolean isLive;
    private boolean isInPlay;
    private boolean isInPlayPaused;
    private boolean isInterrupted;
    private boolean supportsActions;
    private String timeline;
    private int adjustTimeMillis;

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

    public int getHomeCorners() {
        return homeCorners;
    }

    public void setHomeCorners(int homeCorners) {
        this.homeCorners = homeCorners;
    }

    public int getAwayCorners() {
        return awayCorners;
    }

    public void setAwayCorners(int awayCorners) {
        this.awayCorners = awayCorners;
    }

    public int getHomeYellowCards() {
        return homeYellowCards;
    }

    public void setHomeYellowCards(int homeYellowCards) {
        this.homeYellowCards = homeYellowCards;
    }

    public int getAwayYellowCards() {
        return awayYellowCards;
    }

    public void setAwayYellowCards(int awayYellowCards) {
        this.awayYellowCards = awayYellowCards;
    }

    public int getHomeRedCards() {
        return homeRedCards;
    }

    public void setHomeRedCards(int homeRedCards) {
        this.homeRedCards = homeRedCards;
    }

    public int getAwayRedCards() {
        return awayRedCards;
    }

    public void setAwayRedCards(int awayRedCards) {
        this.awayRedCards = awayRedCards;
    }

    public int getHomePenaltyKicks() {
        return homePenaltyKicks;
    }

    public void setHomePenaltyKicks(int homePenaltyKicks) {
        this.homePenaltyKicks = homePenaltyKicks;
    }

    public int getAwayPenaltyKicks() {
        return awayPenaltyKicks;
    }

    public void setAwayPenaltyKicks(int awayPenaltyKicks) {
        this.awayPenaltyKicks = awayPenaltyKicks;
    }

    public boolean isSupportsAchievements() {
        return supportsAchievements;
    }

    public void setSupportsAchievements(boolean supportsAchievements) {
        this.supportsAchievements = supportsAchievements;
    }

    public String getLiveStreamingCountries() {
        return liveStreamingCountries;
    }

    public void setLiveStreamingCountries(String liveStreamingCountries) {
        this.liveStreamingCountries = liveStreamingCountries;
    }

    public String getSportradarMatchId() {
        return sportradarMatchId;
    }

    public void setSportradarMatchId(String sportradarMatchId) {
        this.sportradarMatchId = sportradarMatchId;
    }

    public Date getReferenceTime() {
        return referenceTime;
    }

    public void setReferenceTime(Date referenceTime) {
        this.referenceTime = referenceTime;
    }

    public long getReferenceTimeUnix() {
        return referenceTimeUnix;
    }

    public void setReferenceTimeUnix(long referenceTimeUnix) {
        this.referenceTimeUnix = referenceTimeUnix;
    }

    public String getElapsed() {
        return elapsed;
    }

    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    public double getElapsedSeconds() {
        return elapsedSeconds;
    }

    public void setElapsedSeconds(double elapsedSeconds) {
        this.elapsedSeconds = elapsedSeconds;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public int getTimeToNextPhase() {
        return timeToNextPhase;
    }

    public void setTimeToNextPhase(int timeToNextPhase) {
        this.timeToNextPhase = timeToNextPhase;
    }

    public int getTimeToNextPhaseSeconds() {
        return timeToNextPhaseSeconds;
    }

    public void setTimeToNextPhaseSeconds(int timeToNextPhaseSeconds) {
        this.timeToNextPhaseSeconds = timeToNextPhaseSeconds;
    }

    public String getPhaseSysname() {
        return phaseSysname;
    }

    public void setPhaseSysname(String phaseSysname) {
        this.phaseSysname = phaseSysname;
    }

    public String getPhaseCaption() {
        return phaseCaption;
    }

    public void setPhaseCaption(String phaseCaption) {
        this.phaseCaption = phaseCaption;
    }

    public String getPhaseCaptionLong() {
        return phaseCaptionLong;
    }

    public void setPhaseCaptionLong(String phaseCaptionLong) {
        this.phaseCaptionLong = phaseCaptionLong;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public boolean isInPlay() {
        return isInPlay;
    }

    public void setInPlay(boolean inPlay) {
        isInPlay = inPlay;
    }

    public boolean isInPlayPaused() {
        return isInPlayPaused;
    }

    public void setInPlayPaused(boolean inPlayPaused) {
        isInPlayPaused = inPlayPaused;
    }

    public boolean isInterrupted() {
        return isInterrupted;
    }

    public void setInterrupted(boolean interrupted) {
        isInterrupted = interrupted;
    }

    public boolean isSupportsActions() {
        return supportsActions;
    }

    public void setSupportsActions(boolean supportsActions) {
        this.supportsActions = supportsActions;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    public int getAdjustTimeMillis() {
        return adjustTimeMillis;
    }

    public void setAdjustTimeMillis(int adjustTimeMillis) {
        this.adjustTimeMillis = adjustTimeMillis;
    }
}

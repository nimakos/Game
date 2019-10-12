package gr.nikolis.novibetgame.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.journaldev.novibetgame.R;

import java.util.ArrayList;
import java.util.List;

import gr.nikolis.novibetgame.common.Common;
import gr.nikolis.novibetgame.metadata.UserData;
import gr.nikolis.novibetgame.models.game.BetView;
import gr.nikolis.novibetgame.models.game.Competition;
import gr.nikolis.novibetgame.models.game.Event;
import gr.nikolis.novibetgame.models.FinalObject;
import gr.nikolis.novibetgame.models.game.Game;
import gr.nikolis.novibetgame.models.headlines.HeadLine;
import gr.nikolis.novibetgame.observers.OnGameResponse;
import gr.nikolis.novibetgame.observers.OnGameUpdateResponse;
import gr.nikolis.novibetgame.observers.OnHeadLineResponse;
import gr.nikolis.novibetgame.observers.OnHeadLineUpdateResponse;
import gr.nikolis.novibetgame.repository.Repository;
import gr.nikolis.novibetgame.ui.adapter.MyArrayAdapter;

public class MainActivity extends AppCompatActivity implements OnGameResponse, OnHeadLineResponse, OnGameUpdateResponse, OnHeadLineUpdateResponse {

    private ListView listView;
    private MyArrayAdapter myArrayAdapter;
    private List<FinalObject> finalObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        Repository repository = new Repository();
        UserData userData = new UserData(getApplicationContext());
        String authentication = userData.loadUserData().getType() + " " + userData.loadUserData().getToken();

        repository.getGames(authentication, this);
        repository.getHeadLines(authentication, this);
        repository.getGameUpdates(authentication, this);
        repository.getHeadLinesUpdate(authentication, this);
    }

    public void initUI() {
        listView = findViewById(R.id.listView);
        listView.setAdapter(myArrayAdapter);
        listView.setAdapter(myArrayAdapter);
    }

    @Override
    public void onGameSuccess(List<Game> games) {
        finalObject = new ArrayList<>();
        int i = 0;
        for (Game game : games) {
            for (BetView betView : game.getBetViews()) {
                for (Competition competition : betView.getCompetitions()) {
                    for (Event event : competition.getEvents()) {
                        finalObject.get(i).setView(Common.GAMES_VIEW);
                        finalObject.get(i).setHomeGoals(event.getLiveData().getHomeGoals());
                        finalObject.get(i).setAwayGoals(event.getLiveData().getAwayGoals());
                        finalObject.get(i).setElapsed(event.getLiveData().getElapsed());
                        finalObject.get(i).setCompetitor1(event.getAdditionalCaptions().getCompetitor1());
                        finalObject.get(i).setCompetitor2(event.getAdditionalCaptions().getCompetitor2());
                        i++;
                    }
                }
            }
        }
        myArrayAdapter = new MyArrayAdapter<>(getApplicationContext(), R.layout.view_headline, finalObject);
    }

    @Override
    public void onGameError(Throwable t) {

    }

    @Override
    public void onHeadLineSuccess(List<HeadLine> games) {
        System.out.println();
    }

    @Override
    public void onHeadLineGameError(Throwable t) {
        System.out.println();
    }

    @Override
    public void onGameUpdateSuccess(List<Game> games) {

    }

    @Override
    public void onGameUpdateError(Throwable t) {

    }

    @Override
    public void onHeadLineUpdateSuccess(List<HeadLine> headLines) {
        myArrayAdapter = new MyArrayAdapter<>(getApplicationContext(), R.layout.view_headline, finalObject);
    }

    @Override
    public void onHeadLineUpdateGameError(Throwable t) {

    }
}

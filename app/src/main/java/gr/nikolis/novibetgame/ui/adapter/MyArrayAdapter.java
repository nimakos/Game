package gr.nikolis.novibetgame.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.journaldev.novibetgame.R;

import java.util.List;

import gr.nikolis.novibetgame.common.Common;
import gr.nikolis.novibetgame.models.FinalObject;
import gr.nikolis.novibetgame.models.game.BetItem;

public class MyArrayAdapter<T> extends ArrayAdapter<T> {
    private Context context;
    private List<T> list;

    public MyArrayAdapter(@NonNull Context context, int resource, @NonNull List<T> list) {
        super(context, resource, list);
        this.context = context;
        this.list = list;
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            FinalObject finalObject = (FinalObject) this.list.get(position);
            if (convertView == null) {
                if (getItemViewType(position) == Common.HEADLINE_VIEW) {
                    convertView = LayoutInflater.from(context).inflate(R.layout.view_headline, parent, false);
                } else if (getItemViewType(position) == Common.GAMES_VIEW) {
                    convertView = LayoutInflater.from(context).inflate(R.layout.view_games, parent, false);
                }
            }

            if (getItemViewType(position) == Common.HEADLINE_VIEW) {
                TextView teams = convertView.findViewById(R.id.teams_title);
                TextView time = convertView.findViewById(R.id.time_title);
                TextView vile = convertView.findViewById(R.id.vileTitle);
                TextView double1 = convertView.findViewById(R.id.doubleTitle);
                TextView draw = convertView.findViewById(R.id.draw_title);

                teams.setText(finalObject.getCompetitor1Caption() + "\n" + finalObject.getCompetitor2Caption());
                time.setText(finalObject.getStartTime());
                //vile.setText(finalObject.getHomeGoals());

            } else if (getItemViewType(position) == Common.GAMES_VIEW) {
                TextView firstTeam = convertView.findViewById(R.id.first_team_title);
                TextView secondTeam = convertView.findViewById(R.id.second_team_title);
                TextView firstTeamGoals = convertView.findViewById(R.id.first_team_goals);
                TextView secondTeamGoals = convertView.findViewById(R.id.second_team_goals);
                TextView time = convertView.findViewById(R.id.time_title);
                TextView vile = convertView.findViewById(R.id.vileTitle);
                TextView double1 = convertView.findViewById(R.id.doubleTitle);
                TextView draw = convertView.findViewById(R.id.draw_title);

                firstTeam.setText(finalObject.getCompetitor1());
                secondTeam.setText(finalObject.getCompetitor2());
                firstTeamGoals.setText("" + finalObject.getHomeGoals());
                secondTeamGoals.setText("" + finalObject.getAwayGoals());
                time.setText("" + finalObject.getElapsed());
                for (BetItem betItem : finalObject.getBetItems()) {
                    if (betItem.getCode().equals("1")) {
                        vile.setText(betItem.getCode() + "\t\t\t" + betItem.getPrise());
                    } else if (betItem.getCode().equals("X")) {
                        draw.setText(betItem.getCode() + "\t\t\t" + betItem.getPrise());
                    } else {
                        double1.setText(betItem.getCode() + "\t\t\t" + betItem.getPrise());
                    }
                }
            }


        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        FinalObject finalObject = (FinalObject) list.get(position);
        if (finalObject.getView() == Common.GAMES_VIEW) {
            return Common.GAMES_VIEW;
        } else {
            return Common.HEADLINE_VIEW;
        }
    }
}

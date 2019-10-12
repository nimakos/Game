package gr.nikolis.novibetgame.ui.adapter;

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

import gr.nikolis.novibetgame.models.goal.Games;

public class MyArrayAdapter extends ArrayAdapter<Games> {
    private Context context;
    private int resource;
    private List<Games> games ;
    private TextView teams, time, vile, double1, draw;

    public MyArrayAdapter(@NonNull Context context, int resource, @NonNull List<Games> games) {
        super(context, resource, games);
        this.context = context;
        this.resource = resource;
        this.games = games;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Games games = this.games.get(position);
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.view_headline, parent, false);
        teams = convertView.findViewById(R.id.teams_title);
        time = convertView.findViewById(R.id.time_title);
        vile = convertView.findViewById(R.id.one_title);
        double1 = convertView.findViewById(R.id.two_title);
        draw = convertView.findViewById(R.id.draw_title);

        teams.setText(games.getCaption());
        time.setText(games.getMarketViewKey());
        return convertView;
    }
}

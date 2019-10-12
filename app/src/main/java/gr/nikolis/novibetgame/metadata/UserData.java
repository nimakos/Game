package gr.nikolis.novibetgame.metadata;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import gr.nikolis.novibetgame.models.User;

public class UserData {

    private Context context;

    public UserData(Context context) {
        this.context = context;
    }

    public void saveUserData(User user) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = settings.edit();
        Gson gson = new Gson();
        String json = gson.toJson(user);
        editor.putString("UserData", json);
        editor.apply();
    }

    public User loadUserData() {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = settings.edit();
        Gson gson = new Gson();
        String json = settings.getString("UserData", "");
        editor.apply();
        if (json == null || json.isEmpty()) {
            User user = new User();
            user.setValidated(false);
            return user;
        }
        return gson.fromJson(json, User.class);
    }

    public void clearUserData() {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove("UserData");
        editor.apply();
    }




}

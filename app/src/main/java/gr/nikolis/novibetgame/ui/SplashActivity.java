package gr.nikolis.novibetgame.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.journaldev.novibetgame.R;
import gr.nikolis.novibetgame.metadata.UserData;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        UserData userData= new UserData(getApplication());

        if (userData.loadUserData().isValidated()) {
            Intent main = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(main);
        }else {
            Intent login = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(login);
        }
    }
}

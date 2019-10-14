package gr.nikolis.novibetgame.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.journaldev.novibetgame.R;

import gr.nikolis.novibetgame.metadata.UserData;
import gr.nikolis.novibetgame.models.User;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        UserData userData= new UserData(getApplication());
        User user = new User();
        user.setToken("6AANov3Vn6-a8--q9HTGBPLe-xTVZH3sbOSkuEseHHVzgcx9ILWUfRi1BOwWs65_6nraTCxZKtd2Cq29xy1AE8B9OjOQCNqmxpdBqBXUEe2drhng6jzcEtVXLrt84yb3XKbI5zETYlNygu7MnHN6c7Ek9KAX_ps0SWlue-QD6ariw6lpw4fzMjzqJbdy2ufei6q7VR8zU7AvfQJzGRi7Yw");
        user.setType("Bearer");
        user.setValidated(true);
        userData.saveUserData(user);
        if (userData.loadUserData().isValidated()) {
            Intent main = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(main);
        }else {
            Intent login = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(login);
        }
    }
}

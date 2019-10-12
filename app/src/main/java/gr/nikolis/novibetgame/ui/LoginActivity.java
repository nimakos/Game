package gr.nikolis.novibetgame.ui;


import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.journaldev.novibetgame.R;
import com.journaldev.novibetgame.databinding.ActivityLoginBinding;
import gr.nikolis.novibetgame.metadata.UserData;
import gr.nikolis.novibetgame.viemodels.LoginViewModel;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        LoginViewModel loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        binding.setLoginViewModel(loginViewModel);
        binding.setLifecycleOwner(this);

        loginViewModel.getUser().observe(this, user -> {
            UserData userData = new UserData(this);
            if (user != null && user.isValidated()){
                userData.saveUserData(user);
                Toast.makeText(getApplicationContext(), "User has been Validated", Toast.LENGTH_SHORT).show();
                Intent main = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(main);
            } else {
                userData.clearUserData();
                Toast.makeText(getApplicationContext(), "User has not been Validated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

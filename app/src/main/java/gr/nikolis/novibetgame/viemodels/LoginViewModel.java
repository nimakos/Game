package gr.nikolis.novibetgame.viemodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import gr.nikolis.novibetgame.metadata.UserData;
import gr.nikolis.novibetgame.models.Login;
import gr.nikolis.novibetgame.models.User;
import gr.nikolis.novibetgame.observers.OnLoginResponse;
import gr.nikolis.novibetgame.repository.Repository;


public class LoginViewModel extends AndroidViewModel implements OnLoginResponse {

    public MutableLiveData<String> errorPassword = new MutableLiveData<>();
    public MutableLiveData<String> errorName = new MutableLiveData<>();

    public MutableLiveData<String> email = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();
    private UserData userData;

    //== Constructor ==
    public LoginViewModel(Application application) {
        super(application);
        userData = new UserData(getApplication());
    }

    private MutableLiveData<Integer> busy;

    public MutableLiveData<Integer> getBusy() {
        if (busy == null) {
            busy = new MutableLiveData<>();
            busy.setValue(8);
        }
        return busy;
    }

    private MutableLiveData<User> userMutableLiveData;

    public LiveData<User> getUser() {
        if (userMutableLiveData == null) {
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;
    }

    public void onLoginClicked() {
        errorPassword.setValue("");
        if (!userData.loadUserData().isValidated()) {
            Login login = new Login(email.getValue(), password.getValue());
            Repository repository = new Repository();
            repository.login(login, this);
        }
    }

    @Override
    public void OnSuccess(User user) {
        userMutableLiveData.setValue(user);
        userData.saveUserData(user);
    }

    @Override
    public void OnError(User user) {
        errorPassword.setValue("User has not been Validated");
        userData.clearUserData();
    }
}
package gr.nikolis.novibetgame.models;


public class Login {

    private String mEmail;
    private String mPassword;


    public Login(String email, String password) {
        mEmail = email;
        mPassword = password;
    }

    public String getEmail() {
        if (mEmail == null) {
            return "";
        }
        return mEmail;
    }

    public String getPassword() {

        if (mPassword == null) {
            return "";
        }
        return mPassword;
    }
}


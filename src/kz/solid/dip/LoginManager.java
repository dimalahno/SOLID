package kz.solid.dip;

// High level class
public class LoginManager {

    IAuthenticator authenticator;

    public LoginManager(IAuthenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void login(User user) {
        authenticator.authenticate(user);
    }
}

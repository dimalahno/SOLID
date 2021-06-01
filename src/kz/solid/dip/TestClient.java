package kz.solid.dip;

public class TestClient {
    public static void main(String[] args) {
        User user = new User(1, "user", "password");
        IAuthenticator authenticator = new SimpleLogin();
        LoginManager manager = new LoginManager(authenticator);
        manager.login(user);
    }
}

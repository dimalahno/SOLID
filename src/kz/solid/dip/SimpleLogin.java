package kz.solid.dip;


public class SimpleLogin implements IAuthenticator {

    // low level class
    @Override
    public boolean authenticate(User user) {
        // logic - database
        System.out.println("authenticate: " + user);

        return true;
    }
}

package kz.solid.srp.modem_srp_solution;

public class ConnectionManager implements IConnectionManager{
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Connected established with number: " + phoneNumber);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected successfully");
    }
}

package kz.solid.srp.modem_srp_violation;

public class Phone implements IPhone{


    @Override
    public void dial(String phoneNumber) {
        System.out.println("Connected established with " + phoneNumber);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected");
    }

    @Override
    public void send(String message) {
        System.out.println("Message: " + message +" sent successfully");
    }

    @Override
    public int receive() {
        System.out.println("Data received successfully");
        return 0;
    }
}

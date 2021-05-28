package kz.solid.srp.modem_srp_solution;

public class DataManager implements IDataManager{

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

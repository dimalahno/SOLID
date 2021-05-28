package kz.solid.srp.modem_srp_solution;

public class Phone implements IConnectionManager, IDataManager{

    private IConnectionManager connection;
    private IDataManager dataChanel;

    public Phone(IConnectionManager connection, IDataManager dataChanel) {
        this.connection = connection;
        this.dataChanel = dataChanel;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String message) {
        dataChanel.send(message);
    }

    @Override
    public int receive() {
        return dataChanel.receive();
    }
}

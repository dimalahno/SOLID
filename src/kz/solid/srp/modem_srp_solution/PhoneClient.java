package kz.solid.srp.modem_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManager(), new DataManager());
        phone.dial("0123456789");
        phone.send("message text");
        phone.receive();
        phone.disconnect();
    }
}

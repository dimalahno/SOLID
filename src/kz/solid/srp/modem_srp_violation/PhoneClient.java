package kz.solid.srp.modem_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();
        phone.dial("0123456789");
        phone.send("TestMessageText");
        phone.receive();
        phone.disconnect();
    }
}

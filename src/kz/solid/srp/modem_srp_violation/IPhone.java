package kz.solid.srp.modem_srp_violation;

public interface IPhone {

    // Установка/разрыв соединения
    void dial(String phoneNumber);

    void disconnect();

    // Отправка/получение сообщения
    void send(String message);

    int receive();
}

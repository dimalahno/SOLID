package kz.solid.srp.employee_architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionManager {
    private Connection connection;

    private static DataBaseConnectionManager connectionManager = new DataBaseConnectionManager();

    private DataBaseConnectionManager() {

    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("DataBase URL");
        System.out.println("Connection to DB established");
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("Disconnected from DB");
    }
}

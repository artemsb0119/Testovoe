import java.sql.*;
//Подключение к MySql
public class ConnectMySql {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Test?autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "Qweqweqwe7";
        Connection conn = (Connection) DriverManager.getConnection(url, username, password);
        if (conn == null) {
            System.out.println("Failed to connect database...");
        } else {
            System.out.println("Database connected successful...");
        }
        return conn;
    }

}


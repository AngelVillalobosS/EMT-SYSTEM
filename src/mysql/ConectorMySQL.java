package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectorMySQL {
    public static Connection getInstance() {
        String url = "jdbc:mysql://localhost:3306/mydatabase?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "myuser";
        String password = "myuserpassword";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");
            return conn;
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }

        return null;
    }
}

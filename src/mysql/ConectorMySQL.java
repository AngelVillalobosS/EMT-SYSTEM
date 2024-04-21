
package mysql;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConectorMySQL {
    private static ConectorMySQL _instance;
    private static Properties props;

    private Connection _conn;

    private ConectorMySQL(){
        props = new Properties();
        try (FileInputStream data = new FileInputStream(".env")){
            props.load(data);
        } catch (IOException error){
            error.printStackTrace();
        }
        initialize();
    }

    public static synchronized ConectorMySQL getInstance() {
        if (_instance == null) {
            _instance = new ConectorMySQL();
        }
        return _instance;
    }

    public Connection getConnection() {
        try {
            if (_conn == null || _conn.isClosed() || !isValid(5)) { // Checa que la conexión sea valida
                initialize(); // Reinicia la conexion
            }
        } catch (SQLException e) {
            System.out.println("Error checking if connection is closed: " + e.getMessage());
            initialize(); // Intento de reiniciar si hay error
        }
        return _conn;
    }

    private void initialize() {
        String url = props.getProperty("DATABASE_URL") + props.getProperty("DATABASE_PARAMS");
        String user = props.getProperty("DATABASE_USER");
        String password = props.getProperty("DATABASE_PASSWORD");

        try {
            if (_conn == null || _conn.isClosed()) {
                _conn = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }

    // Checa que la conexión siga valida
    private boolean isValid(int timeoutInSeconds) throws SQLException {
        return _conn != null && _conn.isValid(timeoutInSeconds);
    }
}

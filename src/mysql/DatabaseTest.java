package mysql;
import java.sql.*;

public class DatabaseTest {
    public static void main() {
        String url = "jdbc:mysql://localhost:3306/mydatabase?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "myuser";
        String password = "myuserpassword";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Aspirante");
            System.out.println("ID\tNombre\t\tApellidos\t\tCorreo\t\tWhatsapp");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("nombre");
                String lastname = rs.getString("apellidos");
                String email = rs.getString("correo");
                String wa = rs.getString("whatsapp");

                System.out.println(id + "\t" + name + "\t\t" + lastname + "\t\t" + email + "\t\t" + wa);
            }
            System.out.println("\nConexion a la Base de datos Exitosa!");
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
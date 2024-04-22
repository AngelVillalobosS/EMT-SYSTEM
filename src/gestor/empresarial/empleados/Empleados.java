package gestor.empresarial.empleados;

import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.errores.GestionErrores;
import mysql.ConectorMySQL;

import java.sql.*;


public final class  Empleados implements iEmpleados {
    private String id;
    public GestionErrores error;
    private Contrato[] contratos;
    private DatosEmpresariales[] datos;
    int i, j;

    public Empleados() {
        contratos = new Contrato[100];
        datos = new DatosEmpresariales[100];
        this.i = 0;
        this.j = 0;
    }

    public int addAspirante(String nombre, String apellidos, String correo, String whatsapp) {

        String sql = "INSERT INTO aspirante (nombre, apellidos, correo, whatsapp) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConectorMySQL.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Da los parametros para el PreparedStatement
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellidos);
            pstmt.setString(3, correo);
            pstmt.setString(4, whatsapp);

            // Ejecuta la funcion del insert
            int affectedRows = pstmt.executeUpdate();
            return affectedRows;
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
        return 0;
    }

    public int addEmpleado(String nombre, String apellidos, String correo, String whatsapp, String adscripcion, String puesto, String tipoPuesto) {
        String sql = "INSERT INTO empleado (nombre, apellidos, correo, whatsapp, adscripcion, puesto, tipo_puesto) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConectorMySQL.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellidos);
            pstmt.setString(3, correo);
            pstmt.setString(4, whatsapp);
            pstmt.setString(5, adscripcion);
            pstmt.setString(6, puesto);
            pstmt.setString(7, tipoPuesto);

            int affectedRows = pstmt.executeUpdate();
            return affectedRows;
        } catch (SQLException eEmpleado) {
            System.out.println("SQL Error: " + eEmpleado.getMessage());
        }
        return 0;
    }

    public void addContrato(String id, int anno) {

    }

    public int findEmpleado(int id) {
        String sql = "SELECT * FROM empleado WHERE id = ?;";
        try (Connection conn = ConectorMySQL.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows;
        } catch (SQLException eEmpleado) {
            System.out.println("SQL Error: " + eEmpleado.getMessage());
        }
        return 0;
    }

    private int findEmpleado(String nombre) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        return 0;
    }


    public void setWhatsapp(int id, String whatsapp) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implementa en la BD");
    }

    private String datosPersonales(int i) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implementa en la BD");
        return null;
    }

    public String getInfoEmpleados(int id) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implementa en la BD");
        return null;
    }

    @Override
    public String getInfoEmpleados(String id) {
        return null;
    }

    public String getInfoEmpleado(String nombre) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implementa en la BD");
        return null;
    }

    @Override
    public String getAntiguedad(String id) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implementa en la BD");
        return null;
    }

    public void setAdscripcion(String id, String adscripcion) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implemento en la BD");
    }

    public void setTelefonoExtension(String id, String lada) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implemento en la BD");
    }

    public void setPuesto(String id, String puesto) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implemento en la BD");
    }

    public void showDatosEmpleados() {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implemento en la BD");
    }

    public void showContratoEmpleado(String id) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implemento en la BD");
    }

    public void setCargo(Cargos cargo) {
        System.out.println("Clase en Desuso, no llamar porfavor");
        System.out.println("Esta función se implemento en la BD");
    }
}
package gestor.empresarial.empleados;

import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.errores.GestionErrores;
import mysql.ConectorMySQL;

import java.sql.*;


public final class  Empleados implements iEmpleados{
    private  String id;
    public GestionErrores error;
    private Contrato[] contratos;
    private DatosEmpresariales[] datos;
    int i, j;

    public Empleados(){
        contratos = new Contrato[100];
        datos = new DatosEmpresariales[100];
        this.i = 0;
        this.j = 0;
    }

    public int addAspirante(String nombre, String apellidos, String correo, String whatsapp){

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
        } catch (SQLException eEmpleado){
            System.out.println("SQL Error: " +eEmpleado.getMessage());
        }
        return 0;
    }

    public void addContrato(String id, int anno)
    {

    }

    private int findEmpleado(int id){
        int indiceI=-1;

        for (int j=0; j < this.i ; j++)
        {
            if (datos[j].getId() == id)
                indiceI=j;
        }

        return indiceI;
    }

    private int findEmpleado(String nombre){
        int indiceI=-1;

        for (int j=0; j < this.i ; j++){
            //System.out.println(datosRH[j].getId());
            if (datos[j].getNombre().equals(nombre))
                indiceI=j;
        }

        return indiceI;
    }


    public void setWhatsapp(int id, String whatsapp){
        int i=findEmpleado(id);
        if(i>-1)
        {
            datos[i].setWhatsapp(whatsapp);
        }
        else
        {
            //mensaje de error
        }

    }
    private String datosPersonales(int i)
    {
        String datos = "";
        if(i > -1)
        {
            datos += "Id: " + this.datos[i].getId() + "\n";
            datos += "Nombre: " + this.datos[i].getNombre() + "\n";
            datos += "Apellidos: " + this.datos[i].getApellidos() + "\n";
            datos += "Correo: " + this.datos[i].getCorreo() + "\n";
            datos += "WhatsApp: " + (this.datos[i].getWhatsapp()!=null ? this.datos[i].getWhatsapp() : "No registrado") + "\n";
            datos += "Adscripción: " + (this.datos[i].getAdscripcion() != null ? this.datos[i].getAdscripcion() : "No Registrado") + "\n";
            datos += "Puesto: " + (this.datos[i].getPuesto() != null ? this.datos[i].getPuesto() : "No Registrado") + "\n";
            datos += "  Tipo de Puesto: " + (this.contratos[0].getCargo() != null ? this.contratos[0].getCargo() : "No Registrado") + "\n";
        }

        return datos;
    }
    public String getInfoEmpleados(int id){
        int i=findEmpleado(id);

        if (i<0) {
            System.out.println("Error al buscar por ID: Número de empleado no existente");
            return "";
        }
        else {
            return datosPersonales(i);
        }
    }

    @Override
    public String getInfoEmpleados(String id) {
        return null;
    }

    public String getInfoEmpleado(String nombre){
        int i=findEmpleado(nombre);

        if (i<0) {
            System.out.println("Error al buscar por Nombre: Número de empleado no existente");
            return "";
        }
        else {
            return datosPersonales(i);
        }
    }

    @Override
    public String getAntiguedad(String id) {
        return null;
    }

    public void setAdscripcion(String id, String adscripcion){
        int i=findEmpleado(id);
        if (i > -1) {
            datos[i].setAdscripcion(adscripcion);
        }
        else {
            return;
            //mensaje de error
        }
    }
    public void setTelefonoExtension(String id, String lada){
        int i=findEmpleado(id);
        if (i > -1) {
            datos[i].setTelefonoExterior(lada);
        }
        else {
            return;
            //mensaje de error
        }
    }
    public void setPuesto(String id, String puesto){
        int i = findEmpleado(id);
        if (i > -1) {
            datos[i].setPuesto(puesto);
        }
        else {
            System.out.println("Error al registrar puesto: Número de empleado no existente");
        }
    }
    public void showDatosEmpleados(){
        if (this.i >0) {
            for (int j = 0; j < this.i; j++)
                System.out.println(datosPersonales(j));
        }
        else {
            System.out.println("Error al mostrar todos los empleados: No hay empleados registrados");
        }
    }
    public void showContratoEmpleado(String id){
        if (this.i > 0) {
            for (int j = 0; j < this.i; j++) {
                System.out.println(datosPersonales(j));
            }
        } else {
            System.out.println("Error al mostrar todos los empleados: No hay empleados registrados");
        }

    }


    //    public String getAntiguedad(String id) {
//        int empleadoIndex = findEmpleado(id);
//        if (empleadoIndex != -1) {
//            datos[i].setAn
//        } else {
//            return "Empleado no encontrado.";
//        }
//    }
    public void setCargo(Cargos cargo){
        int i=findEmpleado(id);
        if (i >= 0) {
            contratos[i].setCargo(cargo);
        }
        else {
            System.out.println("Error al registrar cargo: Número de empleado no existente");
        }
    }
}
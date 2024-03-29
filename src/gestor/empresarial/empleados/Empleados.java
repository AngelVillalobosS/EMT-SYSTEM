package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.errores.*;

public final class Empleados implements iEmpleados{
    private  int id;
    public GestionErrores error;

    public Empleados(){

    }

    public void addDatosPersonales(String nombre, String Apellidos, String Correo){

    }
    public void addContato(int id, int antiguedad, String puesto, Cargos cargo){

    }

    private int findEmpleado(int id){
        return id;
    }
    private int findEmpleado(String nombre){
        return 123;
    }
    public void setWhatsapp(int id, String whatsapp){

    }
    private String datosPersonales(int id){
        return "pendiente";
    }
    public String getInfoEmpleados(int id){
        return "pendiente";
    }
    public String getInfoEmpleado(String nombre){
        return "pendiente";
    }
    public void setAdscripcion(int id, String Correo){

    }
    public void setTelefonoExtension(int id, String lada){

    }
    public void setPuesto(int id, String puesto){

    }
    public void showDatosEmpleados(){

    }
    public void showContratoEmpleado(int id){

    }
    public int getAntiguedad(int id){
        return 123;
    }
    public void setCargo(Cargos cargo){

    }
}

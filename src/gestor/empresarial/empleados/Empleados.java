package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.errores.*;

public final class Empleados implements iEmpleados{
    private  String id;
    public GestionErrores error;
    Contrato[] contratos;
    DatosEmpresariales[] datos;
    int i, j;

    public Empleados(){
        contratos = new Contrato[100];
        datos = new DatosEmpresariales[100];
        this.i = 0;
        this.j = 0;
    }

    public void addDatosPersonales(String id, String nombre, String Apellidos, String Correo){

        j++;
    }

    public void addContato(String id, String antiguedad, String puesto, Cargos cargo){

    }

    private String findEmpleado(String id){
        return id;
    }
//    private String findEmpleado(String nombre){
//        return "123";
//    }
    public void setWhatsapp(String id, String whatsapp){

    }
    private String datosPersonales(String id){
        return "pendiente";
    }
    public String getInfoEmpleados(String id){
        return "pendiente";
    }
    public String getInfoEmpleado(String nombre){
        return "pendiente";
    }
    public void setAdscripcion(String id, String Correo){

    }
    public void setTelefonoExtension(String id, String lada){

    }
    public void setPuesto(String id, String puesto){

    }
    public void showDatosEmpleados(){

    }
    public void showContratoEmpleado(String id){

    }
    public String getAntiguedad(String id){
        return "Antiguedad: OwO";
    }
    public void setCargo(Cargos cargo){

    }
}

package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.errores.*;
import gestor.ventanas.Inicio;

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

    public void addDatosPersonales(int id, String nombre, String Apellidos, String Correo){
        //this.id = id;
        //j++;
        if (i<100)
        {
            //datos[i] = new DatosEmpresariales((100 + i),id,nombre,Apellidos, Correo);
            this.i++;
        }
    }

    public void addContato(String id, String antiguedad, String puesto, Cargos cargo){

    }

    private int findEmpleado(int id){
//        int indEmp = 0;
//
//        for(int j=0; j < this.i ; j++)
//        {
//            //if(datos[j].se)
//        }
//
//
        return id;
   }

    public void setWhatsapp(int id, String whatsapp){
        int i=findEmpleado(id);
        if(i>-1)
        {
            datos[i].set
        }

    }
    private String datosPersonales(String id)
    {
        String dt = "";
        dt += "Id " + this.datos[i].getId
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

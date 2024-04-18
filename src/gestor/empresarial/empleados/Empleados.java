package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.errores.GestionErrores;

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

    public boolean addAspirante(String id, String nombre, String apellidos, String correo){
        if (i<100)
        {
            System.out.println("Se ha anniadido un nuevo aspirante");
            datos[i] = new DatosEmpresariales(id, nombre, apellidos, correo);
            this.i++;
        } else {
            System.out.println("El arreglo ha alcanzado su limite");
            return false;
        }
        return true;
    }

    public void addContato(String id, String antiguedad, String puesto, Cargos cargo){

    }

    private int findEmpleado(String id){
        int indEmp = 0;

        for(int j=0; j < this.i ; j++)
        {
            if(datos[j].getId().equals(id))
            {
                indEmp=j;
            }
        }
        return indEmp;
   }

    public void setWhatsapp(String id, String whatsapp){
        int i = findEmpleado(id);
        if(i > -1)
        {
            datos[i].setWhatsapp(whatsapp);
        }
        else
        {
            ;
        }

    }
    private String datosPersonales(String id)
    {
        String dt = "";
        dt += "Id " + this.datos[i].getId() + "\n";
        dt += "Nombre: " + this.datos[i].getNombre();
//        dt +=
//        dt +=
//        dt +=
        return "Hola";
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

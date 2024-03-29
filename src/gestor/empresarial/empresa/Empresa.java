package gestor.empresarial.empresa;
import gestor.empresarial.empleados.Empleados;
import gestor.errores.*;

public final class Empresa {
    private String nombreEmpresa;
    private String represetanteLegal;
    private String telefono;
    private String rfc;
    public Empleados datosRH;
    public GestionErrores error;

    public Empresa(String nombreEmpresa, String represetanteLegal){

    }

    public void setRepresetanteLegal(String nombre){

    }
    public String getRepresetanteLegal(){
        return "Pendiente";
    }
    public void setTelefono(String Telefono){

    }
    public String getInfo(){
        return "Pendiente";
    }
}

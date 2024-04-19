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

    public Empresa(String nombreEmpresa, String rfc ){
        this.nombreEmpresa=nombreEmpresa;
        this.rfc=rfc;
        datosRH = new Empleados();
    }

    public void setRepresetanteLegal(String represetanteLegal){
        this.represetanteLegal = represetanteLegal;
    }
    public String getRepresetanteLegal(){
        return represetanteLegal;
    }
    public void setTelefonoE(String Telefono){
        this.telefono = Telefono;
    }


    public String getInfo(){
        return "Pendiente";
    }
}

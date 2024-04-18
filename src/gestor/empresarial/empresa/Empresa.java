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

    public Empresa(String nombreEmpresa, String rfc){
        this.nombreEmpresa=nombreEmpresa;
        this.rfc=rfc;
    }

    public void setRepresetanteLegal(String repreentanteLegal){
        this.represetanteLegal = repreentanteLegal;

    }
    public String getRepresetanteLegal(){
        return represetanteLegal;
    }
    public void setTelefono(String TelefonoE){
        this.telefono = TelefonoE;
    }

    public String getInfo()
    {
        String datos="";

        datos += "Representante Legal: " + this.represetanteLegal + "\n";
        datos += "Empresa: " + this.nombreEmpresa + "\n";
        datos += "RFC: " + this.rfc + "\n";
        datos += "Teléfono empresarial: " + (this.telefono!=null ? this.telefono : "No registrado") + "\n";

        return datos;
    }

}

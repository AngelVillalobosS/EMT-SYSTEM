package gestor.errores;
import java.util.HashMap;
import java.util.Map;

public class GestionErrores {
    private Map<Integer, String> error  = new HashMap<Integer, String>();
    private boolean existeError;
    private int noError;
    private String descripcionTecnica;

    public GestionErrores(){

    }

    private void cargarErrores(){

    }
    public void setNoError(int noError, String descripcionTecnica){

    }
    public String getError(){
        return "Pendiente";
    }
    public String getErrorTecnico(){
        return "Pendiente";
    }
    public boolean existeError(){
        return true;
    }
}

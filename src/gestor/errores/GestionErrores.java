package gestor.errores;
import java.util.HashMap;
import java.util.Map;
import gestor.archivos.*;

public class GestionErrores {
    private Map<Integer, String> error  = new HashMap<>();
    private boolean existeError;
    private int noError;
    private String descripcionTecnica;

    ArchivoTexto archivoerrores;
    public GestionErrores(){
        archivoerrores = new ArchivoTexto("C:\\Users\\LC11-8\\Documents\\ArchivosErrores\\errores.txt");
        archivoerrores.AbrirModoEscritura();
        error.put(1, "Datos Incorrectos");
        error.put(2, "Acceso Denegado");
        error.put(3, "Valor Inesperado");
    }

    private void cargarErrores(){

    }
    public void setNoError(int noError, String descripcionTecnica){

    }
    public String getError(int folio){
        archivoerrores.Escribir(error.get(folio));
        archivoerrores.Cerrar();
        return error.get(folio);
    }
    public String getErrorTecnico(){
        return "Pendiente";
    }
    public boolean existeError(){
        return true;
    }
}

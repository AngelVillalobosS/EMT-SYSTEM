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
        error.put(3, "Dato obligatorio no ingresado");
        error.put(4, "Error de sintaxis");
        error.put(5, "Error de conexión");
        error.put(6, "Archivo no encontrado");
        error.put(7, "Memoria Insuficiente");
        error.put(8, "Registro duplicado");
        error.put(9, "Campos obligatorios incompletos");
        error.put(10, "Error al guardar");
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

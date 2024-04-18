package gestor.archivos;

public abstract class ControlArchivos {
    private String nomArchivo;

    public ControlArchivos(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }

    public boolean Crear() {
        System.out.println("Creando Archivo...");
        return true;
    }
}
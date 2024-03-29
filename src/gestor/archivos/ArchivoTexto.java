package gestor.archivos;
import java.io.*;

public final class ArchivoTexto implements iFileText {
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean archivoExiste;
    private boolean modoLectura;
    private boolean modoEscritura;

    public ArchivoTexto(String tituloArchivo){
        try {
            file = new File(tituloArchivo);

            if (!file.exists())
                file.createNewFile();

            this.archivoExiste = true;
            this.modoLectura = false;
            this.modoEscritura = false;
        } catch (Exception e){
            System.out.println("Error al intentar buscar el archivo");
            this.archivoExiste = false;
        }
    }


    public ArchivoTexto(String nomArchivo, boolean modoLectura) {
        this.file = new File(nomArchivo);
        this.archivoExiste = file.exists();
        this.modoEscritura = !modoLectura;
        this.modoLectura = modoLectura;
    }

    public void AbrirModoLectura() {
        if (archivoExiste) {
            try {
                fr = new FileReader(this.file.getAbsoluteFile());
                br = new BufferedReader(this.fr);
                this.modoLectura = true;
                System.out.println("Archivo abierto en modo lectura");
            } catch (Exception e){
                System.out.println("Error: El archivo no se puede abrir en modo lectura");
            }
        }
    }

    public String Leer() {
        if (archivoExiste){
            try {
                return this.br.readLine();
            } catch (Exception e) {
                System.out.println("Hubo un problema al leer el archivo");
            }
        }
        return null;
    }

    public void AbrirModoEscritura() {
        if (archivoExiste){
            try {
                fw = new FileWriter(this.file.getAbsoluteFile(), true); // getAbosoluteFile(), obtiene la ruta y el archivo
                bw = new BufferedWriter(this.fw);
                modoEscritura = true;
                System.out.println("Archivo abierto en modo escritura");
            } catch (Exception e){
                System.out.println("Error: El archivo no se puede abrir en modo escritura");
            }
        }
    }

    public void Escribir(String texto) {
        if(archivoExiste){
            try{
                System.out.println("Guardando en el archivo");
                this.bw.write(texto + "\n");
            } catch (Exception e){
                System.out.println("Error: No se puede escribir información en el archivo");
            }
        }
    }

    public void Cerrar() {
        try {
            if (modoEscritura){
                this.bw.close();
                this.fw.close();
            }
            else if (modoLectura) {
                this.br.close();
                this.fr.close();
            }
        } catch (Exception e){
            System.out.println("No se puede cerrar el archivo");
        }
    }
}

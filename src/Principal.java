import gestor.archivos.*;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        // Crear instancia de ArchivoTexto en modo escritura
        ArchivoTexto file1 = new ArchivoTexto("C:\\Prueba\\Mireya.txt", false);

        // Abrir en modo escritura
        file1.AbrirModoEscritura();

        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un texto: ");
        String texto = scan.nextLine();

        // Escribir contenido en el archivo (mensaje simulado)
        file1.Escribir(texto);

        // Cerrar el archivo
        file1.Cerrar();

        // Crear instancia de ArchivoTexto
        ArchivoTexto fileLectura = new ArchivoTexto("C:\\Prueba\\Mireya.txt");
        String leido;
        // Abrir en modo lectura
        fileLectura.AbrirModoLectura();
        texto = fileLectura.Leer();
        // Leer el contenido (mensaje simulado)
        while (texto != null){
            System.out.println(texto);
            texto = fileLectura.Leer();
        }

        // Cerrar el fileLectura
        fileLectura.Cerrar();
    }
}
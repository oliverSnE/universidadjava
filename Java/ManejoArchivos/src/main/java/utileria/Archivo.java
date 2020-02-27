
package utileria;

import com.sun.org.apache.bcel.internal.generic.SALOAD;
import java.io.*;


public class Archivo {
   
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        
        try {
            FileWriter salida = new FileWriter(archivo);
            salida.close();
            System.out.println("Archivo creado correctamente...");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombreArchivo) {
        File arFile = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(arFile);
            String contenido = "Contenido a escribir";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File arFile = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(arFile));
            try {
                String lectua = entrada.readLine();
                while (lectua != null) {                    
                    System.out.println(lectua);
                    lectua = entrada.readLine();
                }
                entrada.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void agregarArchivo(String nombreArchivo) {
            
        File arFile = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(arFile, true));
            String contenido = "Anexando info";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        catch (IOException ex) {
            ex.printStackTrace(System.out);
        } 
        
    }
}

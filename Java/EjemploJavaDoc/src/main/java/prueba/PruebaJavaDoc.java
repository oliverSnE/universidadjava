/**
 * Derechos reservados oliver
 */
package prueba;

import com.oliver.javadoc.Aritmetica;

/**
 *
 * @author Teknol clase para probar javadocs
 */
public class PruebaJavaDoc {

    /**
     * metodo que ejectura la prueba de la clase aritmetica
     *
     * @param args es un arreglo de tipo string
     */
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica(10, 60);

        int res = aritmetica.sumar();
        imprisuma(1, 2, 3, 4);
        imprisumaForEach(10,10,10,10);
        imprisumaForEachVars("Oliver", 3,2,1,5);

    }

    public static void imprisuma(int... numeros) {
        int elementos;
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            elementos = numeros[i];
            System.out.println("Numero: " + elementos);
            res += numeros[i];

        }
        System.out.println("suma de los numeros: " + res);
    }
    public static void imprisumaForEach(int... numeros) {
        System.out.println("FOREACH");
        int elementos;
        int res = 0;
        for (int numero: numeros) {
            elementos = numero;
            System.out.println("Numero: " + elementos);
            res += numero;

        }
        System.out.println("suma de los numeros: " + res);
    }
    public static void imprisumaForEachVars(String nombre, int... numeros) {
        System.out.println("FOREACHVARS");
        System.out.println(nombre);
        int elementos;
        int res = 0;
        for (int numero: numeros) {
            elementos = numero;
            System.out.println("Numero: " + elementos);
            res += numero;

        }
        System.out.println("suma de los numeros: " + res);
    }
}

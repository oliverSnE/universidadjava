/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ejemploconversionobjetos.*;

/**
 *
 * @author Teknol
 */
public class PruebaConversion {

    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Oliver", 5000, TipoEscritura.CLASICO);
        
        System.out.println(empleado.obtenerDetalles());
        
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscrituraEnTexto());
        System.out.println("");
        System.out.println( ((Escritor)empleado).getTipoEscrituraEnTexto()   );
        
        empleado = new Gerente("Sinue", 6000, "Sistemas");
        
        System.out.println( ((Gerente) empleado).getDepartamento()  );
        
        
    }

}

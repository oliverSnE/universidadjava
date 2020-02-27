/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teknol
 */
public class Persona {
   String nombre;
   String apellido;
   
   public void desplegarNombre(  ) {
       System.out.println("Nombre: "+nombre);
       System.out.println("Apellido: "+apellido);
   }
   public void desplegarNombre( String nombre, String apellido ) {
       System.out.println("Nombre: "+nombre);
       System.out.println("Apellido: "+apellido);
   }
   
   
}

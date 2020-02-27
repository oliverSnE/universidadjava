/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teknol
 */
public class PruebaPersonas {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
        persona.nombre = "oliver";
        persona.apellido = "Burgara";
        
        persona.desplegarNombre();
        persona.desplegarNombre("Sinue", "Estrella");
        
      
    }
}

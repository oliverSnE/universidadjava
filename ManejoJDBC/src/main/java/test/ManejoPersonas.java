
package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;


public class ManejoPersonas {
    public static void main(String[] args) {
        PersonaJDBC personaJdbc = new PersonaJDBC();
        
        List<Persona> personas = personaJdbc.select();
        
        for(Persona persona:personas) {
            System.out.println("persona: " + persona);
        }
        
        Persona persona = new Persona("Cynthia","Cordova","cc@email.com","6622010203");
        
        //personaJdbc.insert(persona);
        
    }
}


package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;


public class ManejoPersonas {
    public static void main(String[] args) {
        PersonaJDBC personaJdbc = new PersonaJDBC();
        
        //Seleccionar todos los registros
        List<Persona> personas = personaJdbc.select();
        
        for(Persona persona:personas) {
            System.out.println("persona: " + persona);
        }
        //Insertar un nuevo registro
        //Persona persona = new Persona("Cynthia","Cordova","cc@email.com","6622010203");
        //personaJdbc.insert(persona);
        
        //Actualizar 
        //Persona persona = new Persona(5, "Carolina", "Manquiquez", "cm@gmail.com", "6622000000");
        //personaJdbc.update(persona);
        
        //Eliminar registro
        Persona persona = new Persona();
        persona.setId(2);
        personaJdbc.delete(persona);
    }
}

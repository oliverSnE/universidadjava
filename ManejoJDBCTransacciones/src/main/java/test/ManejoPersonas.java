
package test;

import datos.PersonaJDBC;
import datos.Conexion;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class ManejoPersonas {
    public static void main(String[] args) {
        
        List<Persona> personas = new ArrayList<Persona>();
         Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            
            Persona personaU = new Persona(3, "Caro", "Manquizez", "a@gmail.com", "123456");
            personaJDBC.update(personaU);
            
            Persona personaI = new Persona("Sinue", "Estrella", "sinue@gmail.com", "6622010203");
            personaJDBC.insert(personaI);
           
            personas = personaJDBC.select();
            
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            
             conexion.commit();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entrando al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}

package test;

import datos.PersonaDaoJDBC;
import datos.Conexion;
import datos.PersonaDaoInterface;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class ManejoPersonas {

    public static void main(String[] args) {

        List<PersonaDTO> personas = new ArrayList<PersonaDTO>();
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDaoInterface personaDao = new PersonaDaoJDBC(conexion);

            personas = personaDao.select();

            for (PersonaDTO persona: personas) {
                
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

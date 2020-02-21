
package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;


public class PersonaJDBC {
    
    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre,apellido,email,telefono) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?,apellido=?,email=?,telefono=? WHERE id=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id=?";
    
    public List<Persona> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<Persona>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new Persona(id, nombre, apellido,email,telefono);
//                persona.setId(id);
//                persona.setNombre(nombre);
//                persona.setApellido(apellido);
//                persona.setEmail(email);
//                persona.setTelefono(telefono);
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return personas;
    }
    
    public int insert(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            System.out.println("Ejecutando query: "+ SQL_INSERT);

            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
            
        }
        return rows;
    }
    
    
}

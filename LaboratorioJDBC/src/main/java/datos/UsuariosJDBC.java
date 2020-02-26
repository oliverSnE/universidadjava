package datos;
import domain.Usuario;
import java.sql.*;
import java.util.*;


public class UsuariosJDBC {
    
    private static final String SQL_SELECT = "SELECT * FROM usuarios";
    private static final String SQL_INSERT = "INSERT INTO usuarios(usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuarios SET usuario=?,password=? WHERE id=?";
    private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id=?";
    
    public List<Usuario> select() {
        
        Connection cn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        try {
            cn = Conexion.getConexion();
            stmt = cn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String user = rs.getString("usuario");
                String pass = rs.getString("password");
                usuario = new Usuario(id, user, pass);
                usuarios.add(usuario);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            Conexion.close(cn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return usuarios; 
        
    } 
    
    public int insert(Usuario usuario) {

        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            cn = Conexion.getConexion();
            stmt = cn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            rows = stmt.executeUpdate();
            System.out.println("Rows afectadas: " + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            Conexion.close(cn);
            Conexion.close(stmt);
        }
        
        return rows;
    }
    public int update(Usuario usuario) {

        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            cn = Conexion.getConexion();
            stmt = cn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId());
            rows = stmt.executeUpdate();
            System.out.println("Rows afectadas: " + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            Conexion.close(cn);
            Conexion.close(stmt);
        }
        
        return rows;
    }
    
    public int delete(Usuario usuario) {
        Connection cn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            cn = Conexion.getConexion();
            stmt = cn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId());
            rows = stmt.executeUpdate();
            System.out.println("Rows afectados: " + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            Conexion.close(cn);
            Conexion.close(stmt);
        }
        return rows;
    }
}

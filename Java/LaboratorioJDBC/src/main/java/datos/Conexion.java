
package datos;
import java.sql.*;



public class Conexion {
    private static final String JSBC_URL = "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
    private static final String JSBC_USER = "oliversne";
    private static final String JSBC_PASSWORD = "1503";
    
    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(JSBC_URL, JSBC_USER, JSBC_PASSWORD);
    }
    
    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}

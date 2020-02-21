
package ejemplo.jdbc;

import java.sql.*;


public class IntroduccionJDBC {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        
        try {
            
            Connection conexion = DriverManager.getConnection(url,"oliversne","1503");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT * FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.println("ID: "+ resultado.getInt(1));
                System.out.println("Nombre: "+ resultado.getString(2));
                System.out.println("apellido: "+ resultado.getString(3));
                System.out.println("email: "+ resultado.getString(4));
                System.out.println("telefono: "+ resultado.getString(5));
            }
            resultado.close();
            instruccion.close();
            conexion.close();
            
            
        }
        catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
       
    }
    
}

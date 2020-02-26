
package test;
import datos.*;
import domain.Usuario;
import java.util.*;

public class ManejoUsuarios {
    
    
    public static void main(String[] args) {
        
        UsuariosJDBC usuarioJDBC = new UsuariosJDBC();
        
        List<Usuario> usuarios = usuarioJDBC.select();
        
        for (Usuario usuario: usuarios) {
            System.out.println(usuario);
        }
        
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuarioJDBC.delete(usuario);
        
        usuarios = usuarioJDBC.select();
        
        for (Usuario usuario2: usuarios) {
            System.out.println(usuario2);
        }
        
        
        
    }
    
}

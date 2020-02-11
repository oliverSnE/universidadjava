
package genericos;


public class ClaseGenerica<T> {
    T objecto;

    public ClaseGenerica(T objeto) {
    
        this.objecto = objeto;
    }
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objecto.getClass().getSimpleName());
    }
    
    
    
    
}

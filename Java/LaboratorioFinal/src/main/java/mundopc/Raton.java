/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

/**
 *
 * @author Teknol
 */
public class Raton extends DispositivoEntrada {
    
    private int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "\n\t\tidRaton: " + idRaton + 
                ", \t"+ super.toString() + "\n\t\t}";
    }
    
    
}

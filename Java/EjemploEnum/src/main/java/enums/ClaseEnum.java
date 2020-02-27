/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Teknol
 */
public class ClaseEnum {
    public static void main(String[] args) {
       
        indicarDias(Dias.VIERNES);
        System.out.println(Dias.VIERNES.getDias());
 
        obtenerDias();
    }
    
    public static void obtenerDias() {
        for (Dias dia: Dias.values()) {
            System.out.println("dia = " + dia);
        }
    }
    
    
    

    public enum Dias {
        LUNES(1),
        MARTES(2),
        MIERCOLES(3),
        JUEVES(4),
        VIERNES(5),
        SABADO(6),
        DOMINGO(7);
        
        private final int dias;
        
        Dias(int dias) {
            this.dias = dias;
        }
        public int getDias() {
        return this.dias;
    }
        
       
    }
    public static void indicarDias(Dias dias) {
        switch(dias) {
            case LUNES:
                System.out.println("Lunes");
                break;
            case MARTES:
                System.out.println("MARTES");
                break;
            case MIERCOLES:
                System.out.println("MIERCOLES");
                break;
            case JUEVES:
                System.out.println("JUEVES");
                break;
            default:
                System.out.println("FIN DE SEMANA");
                break;
        }
    }
    
}

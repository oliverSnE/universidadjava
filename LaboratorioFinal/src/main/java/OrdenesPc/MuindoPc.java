/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenesPc;

import mundopc.*;

/**
 *
 * @author Teknol
 */
public class MuindoPc {

    public static void main(String[] args) {
        Monitor monitorDell = new Monitor("Dell", 15.5);
        Teclado tecladoLogi = new Teclado("USB", "Logitech");
        Raton ratonLogi = new Raton("Bluetooth", "Logitech");
        Computadora computadoraAcer = new Computadora("Acer", monitorDell, tecladoLogi, ratonLogi);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadoraAcer);
        orden1.mostrarOrden();
    }

}

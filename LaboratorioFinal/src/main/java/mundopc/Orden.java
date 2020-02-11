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
public class Orden {
    
    private int idOrden;
    private Computadora computadoras [];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 5;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora; 
        }
        else {
            System.out.println("El limite para agregar es de: "+MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Computadoras de la orden #" + idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }    
}

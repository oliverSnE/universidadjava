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
public class Monitor {

    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    public Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "\n\t\tidMonitor: " +idMonitor + 
                ", \n\t\tmarca: " + marca + 
                ", \n\t\ttamanio: " + tamanio ;
    }

    

}

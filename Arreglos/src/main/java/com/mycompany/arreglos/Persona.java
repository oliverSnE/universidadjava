/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglos;

/**
 *
 * @author Teknol
 */
public class Persona {
    private String nombre;
    
    private static int contadorPersona;

    private int idPersona;
    public Persona(String nombre) {
    
        this.idPersona = ++contadorPersona;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static int getNumPersona() {
        return contadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{ \nid = " + idPersona +"\nnombre = " + nombre + '}';
    }
    
    
    
}

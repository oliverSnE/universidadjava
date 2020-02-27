/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import genericos.*;

/**
 *
 * @author Teknol
 */
public class ManejoGenericosTest {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        
        objetoInt.obtenerTipo();
        ClaseGenerica<String> objetoStg = new ClaseGenerica("Hola");
        
        objetoStg.obtenerTipo();
    }
    
}

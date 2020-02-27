/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Division;
import domain.OperacionExcepcion;

/**
 *
 * @author Teknol
 */
public class ManejoExcepciones1 {
    public static void main(String[] args) {
        Division d;
        try {
            d = new Division(10, 0);
            d.operacion();
        } catch (OperacionExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("<continua");
        
        
    }
}

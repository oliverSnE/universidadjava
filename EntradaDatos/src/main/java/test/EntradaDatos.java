/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Teknol
 */
public class EntradaDatos {
    public static void main(String[] args) {
        String captura = null;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdusca el dato: ");
        captura = scanner.nextLine();

        
        System.out.println("Dato introducido = " + captura);
    }
    
}

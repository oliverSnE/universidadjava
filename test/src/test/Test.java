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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int palabra;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        
        do {
            
            System.out.println("Elija del menú "+count);
            System.out.println("1: continuar");
            System.out.println("2: salir");
            palabra = scanner.nextInt();
            switch (palabra) {
                case 1: 
                    System.out.println("Continuamos");
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
                    
                    case 3: 
                      
                        System.out.println("selecciono el 3");
                default:
                    System.out.println("No se encuentra en el menu");
                    break;
                     
            }
            count++;
               
        }while(palabra != 2);
       
    }
    
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Teknol
 */
public class EntradaDatos1 {
    public static void main(String[] args) {
        String captura;
        
        InputStreamReader input = new InputStreamReader(System.in);
        
        BufferedReader brInput = new BufferedReader(input);
        
        System.out.println("Intoduce el dato: ");
        try {
            captura = brInput.readLine();
            System.out.println("Dato intoducido = " + captura);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}

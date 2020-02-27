
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teknol
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        n1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = scanner.nextInt();

        Aritmetica aritmetica = new Aritmetica();
        int res = aritmetica.sumar(n1, n2);
        
        System.out.println("Resultado: "+ res);
        System.out.println("Resultado: "+ Math.PI);
    }
}

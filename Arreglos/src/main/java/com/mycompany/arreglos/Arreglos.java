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
public class Arreglos {

    public static void main(String[] args) {

        int matriz[][] = new int[3][2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;
        int menor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                menor = matriz[i][j];

                System.out.println("Matriz indice [" + i + "][" + j + "]: " + matriz[i][j] + "> " + menor);

            }
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;

import abstracto.domain.*;

/**
 *
 * @author Teknol
 */
public class EjemploClasesAbstractas {

    public static void main(String[] args) {

        FiguraGeometrica r = new Rectangulo("Rectangulo");
        System.out.println("r = " + r);
        r.dibujar();

        FiguraGeometrica c = new Circulo("Circulo");
        System.out.println("c = " + c);
        c.dibujar();

        FiguraGeometrica t = new Triangulo("Triangulo");
        System.out.println("t = " + t);
        t.dibujar();
    }

}

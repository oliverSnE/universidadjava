/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Empleado;

/**
 *
 * @author Teknol
 */
public class ClaseObject {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Oliver", 1000);
        System.out.println("emp1 = " + emp1);

        Empleado emp2 = new Empleado("Oliver", 1000);
        System.out.println("emp2 = " + emp2);

        compararObjetos(emp1, emp2);

    }

    private static void compararObjetos(Empleado emp1, Empleado emp2) {
        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);

        if (emp1 == emp2) {
            System.out.println("Misma direccion de memorioa");
        } else {
            System.out.println("Distinta direccion de memorioa");

        }
        if(emp1.equals(emp2)){
            System.out.println("Objetos tienen el mismo contenido");
        }
        else {
            System.out.println("Objetos distintos");
        }
        
        if(emp1.hashCode() == emp2.hashCode()) {
            System.out.println("Objetos mismo codigo hash");
            System.out.println("emp1 = " + emp1.hashCode());
            System.out.println("emp2 = " + emp2.hashCode());
        }
        else {
            System.out.println("Objetos con distinto hash");
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejojavabeans;
import beans.PersonaBean;
/**
 *
 * @author Teknol
 */
public class ManejoJavaBeans {
    public static void main(String[] args) {
        PersonaBean pb = new PersonaBean("Oliver", 32);
        System.out.println("pb = " + pb);
        
        pb.setNombre("Sinue");
        pb.setEdad(20);
        
        System.out.println("Nombre = " + pb.getNombre());
        System.out.println("Edad = " + pb.getEdad());
    }
}

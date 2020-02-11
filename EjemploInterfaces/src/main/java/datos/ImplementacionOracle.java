/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Teknol
 */
public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insert() {

        System.out.println("Insertar desde oracle");
    }

    @Override
    public void listar() {

        System.out.println("Listar desde oracle");

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerface;

import datos.*;

/**
 *
 * @author Teknol
 */
public class EjemploInterfaces {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();

        datos.insert();

        datos = new ImplementacionMySql();
        datos.insert();
        datos.listar();
        System.out.println(AccesoDatos.MAX_REGISTROS);
    }
}

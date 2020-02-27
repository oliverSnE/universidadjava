/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

/**
 *
 * @author Teknol
 */
public class ImplementacionMySql implements AccesoDatos {

    private boolean simularError;

    @Override
    public void insert() throws AccesoDatosEx {

        if (simularError) {
            throw new EscrituraDatosEx("Error de escritura");
        } else {
            System.out.println("Insertar desde MySql");

        }
    }

    @Override
    public void listar() throws AccesoDatosEx {

        if (this.simularError) {
            throw new LecturaDatosEx("Error de lectura de datos");
        } else {

            System.out.println("Listar desde MySql");
        }

    }

    @Override
    public void sumularError(boolean simularError) {
        this.simularError = simularError;
    }

    public boolean isSimularError() {
        return this.simularError;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import excepciones.AccesoDatosEx;

/**
 *
 * @author Teknol
 */
public interface AccesoDatos {
    public static final int MAX_REGISTROS = 10;
    
    public abstract void insert() throws AccesoDatosEx;
    public abstract void listar() throws AccesoDatosEx;
    public abstract void sumularError (boolean simularError);
    
}

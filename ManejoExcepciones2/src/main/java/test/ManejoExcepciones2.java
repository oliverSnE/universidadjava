/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.*;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teknol
 */
public class ManejoExcepciones2 {
    public static void main(String[] args) {
        AccesoDatos ad = new ImplementacionMySql();
        ad.sumularError(true);
        ejecutar(ad, "listar");
    }
    
    private static void ejecutar(AccesoDatos datos, String accion) {
        
        if("listar".equals(accion)) {
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println("Error de lectura: "+ ex.getMessage());
            }
             catch (AccesoDatosEx ex) {
                 System.out.println("Error acceso datos: "+ ex.getMessage());
            }
            catch (Exception ex) {
                System.out.println("Error general: "+ex.getMessage());
            }
            finally {
                System.out.println("Finally");
            }
            
        }
        else if ("insertar".equals(accion)){
            try {
                datos.insert();
            } catch (AccesoDatosEx ex) {
                System.out.println("Excepcuion acciso datos = " + ex.getMessage());
            }
        }
        else {
            System.out.println("No se proporcionó ninguna accion");
        }
    }
}

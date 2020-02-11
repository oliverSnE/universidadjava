package ventas;

import com.oliver.ventas.Orden;
import com.oliver.ventas.Producto;

public class Ventas {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Playera", 100);
        Producto producto2 = new Producto("Pantalon", 200);
        Producto producto3 = new Producto("Zapatos", 300);
        Producto producto4 = new Producto("tennis", 400);
        
        Orden orden1 = new  Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();
         System.out.println("");
        Orden orden2 = new  Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
        
    }
}

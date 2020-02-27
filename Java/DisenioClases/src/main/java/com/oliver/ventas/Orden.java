package com.oliver.ventas;

/**
 *
 * @author Teknol
 */
public class Orden {

    private int id;
    private Producto productos[];
    private static int contadorOrden;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.id = ++contadorOrden;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;

        } else {
            System.out.println("Se ha superado el máximo de productos: " + MAX_PRODUCTOS);
        }
    }
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }
    public void mostrarOrden() {
        System.out.println("Orden #: "+ this.id);
        System.out.println("Total $: "+ this.calcularTotal());
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }

}

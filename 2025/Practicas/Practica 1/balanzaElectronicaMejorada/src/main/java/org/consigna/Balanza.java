package org.consigna;

import java.util.LinkedList;
import java.util.List;

public class Balanza {
    private LinkedList<Producto> productos;

    public Balanza() {
        this.productos = new LinkedList<>();
    }

    public void ponerEnCero() {
        this.productos.clear();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public Ticket emitirTicket() {
        return new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
    }

    public Double getPesoTotal() {
        double total = 0;
        for(Producto p : this.productos)
            total += p.getPeso();
        return total;
    }

    public Double getPrecioTotal() {
        double total = 0;
        for(Producto p : this.productos)
            total += p.getPrecio();
        return total;
    }

    public int getCantidadDeProductos() {
        return this.productos.size();
    }

    public List<Producto> getProductos() {
        return this.productos;
    }
}

package org.consigna;

public class Balanza {
    private Integer cantidadDeProductos;
    private Double precioTotal;
    private Double pesoTotal;

    public Balanza() {
        this.pesoTotal = 0.0;
        this.cantidadDeProductos = 0;
        this.precioTotal = 0.0;
    }

    public void ponerEnCero() {
        this.pesoTotal = 0.0;
        this.cantidadDeProductos = 0;
        this.precioTotal = 0.0;
    }

    public void agregarProducto(Producto producto) {
        this.precioTotal += producto.getPrecio();
        this.cantidadDeProductos++;
        this.pesoTotal += producto.getPeso();
    }

    public Ticket emitirTicket() {
        return new Ticket(cantidadDeProductos,pesoTotal,precioTotal);
    }

    public Double getPesoTotal() {
        return this.pesoTotal;
    }

    public Double getPrecioTotal() {
        return this.precioTotal;
    }

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }
}

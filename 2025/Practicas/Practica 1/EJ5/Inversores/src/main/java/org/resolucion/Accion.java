package org.resolucion;

public class Accion implements Inversion {
    private double valorUnitario;
    private int cantidad;
    private String nombre;

    public Accion(double valorUnitario, int cantidad, String nombre) {
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public double getValorActual() {
        return this.valorUnitario * this.cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }
}

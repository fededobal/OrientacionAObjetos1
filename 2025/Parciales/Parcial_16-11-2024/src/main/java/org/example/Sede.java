package org.example;

public class Sede {
    private String nombre;
    private double precioXDia;
    private int cantDias;

    public double precioTotal() {
        return this.precioXDia * this.cantDias;
    }
}

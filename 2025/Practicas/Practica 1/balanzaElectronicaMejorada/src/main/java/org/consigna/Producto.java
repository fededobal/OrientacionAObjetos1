package org.consigna;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto(String descripcion, double peso, double precioPorKilo) {
        this.peso = peso;
        this.precioPorKilo = precioPorKilo;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precioPorKilo * this.peso;
    }

    public void setPrecioPorKilo(double i) {
        this.precioPorKilo = i;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getPrecioPorKilo() {
        return this.precioPorKilo;
    }
}

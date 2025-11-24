package org.example;

public class Inmueble implements Bien {
    private String partida;
    private double valorLote;
    private double valorEdificacion;

    public Inmueble(String partida, double valorLote, double valorEdificacion) {
        this.partida = partida;
        this.valorLote = valorLote;
        this.valorEdificacion = valorEdificacion;
    }

    @Override
    public double calcularImpuesto() {
        return (this.valorLote + this.valorEdificacion) * 0.01;
    }
}

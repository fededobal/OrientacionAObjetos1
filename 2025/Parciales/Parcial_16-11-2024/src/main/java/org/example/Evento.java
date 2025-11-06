package org.example;

import java.time.LocalDate;

public abstract class Evento {
    private String nombre;
    private LocalDate fecha;
    private String temaP;
    private double precioI;
    private double precioR;

    public Evento(String nombre, LocalDate fecha, String temaP, double precioI, double precioR) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.temaP = temaP;
        this.precioI = precioI;
        this.precioR = precioR;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double calcularAsistencia() {
        double aux = this.precioI + this.precioR + this.extra();
        if(this.fecha.isEqual(LocalDate.now()))
            aux += this.precioI * 0.2;
        return aux;
    }

    protected abstract double extra();
}

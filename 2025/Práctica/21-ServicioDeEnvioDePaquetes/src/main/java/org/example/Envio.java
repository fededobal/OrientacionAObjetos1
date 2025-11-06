package org.example;

import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fechaD;
    private String dirOrigen;
    private String dirDestino;
    private double peso;

    public Envio(LocalDate f, String dirO, String dirD, double p) {
        fechaD = f;
        dirOrigen = dirO;
        dirDestino = dirD;
        peso = p;
    }

    abstract double costo();

    protected String getDirDestino() {
        return dirDestino;
    }

    protected double getPeso() {
        return peso;
    }

    public boolean perteneceAFechas(DateLapse fechas) {
        return fechas.includesDate(this.fechaD);
    }
}

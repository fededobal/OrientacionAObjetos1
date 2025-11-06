package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Entrada {
    private boolean seguro;
    private LocalDate fechaC;
    private Evento evento;

    public Entrada(Evento evento, boolean seguro) {
        this.evento = evento;
        this.seguro = seguro;
        this.fechaC = LocalDate.now();
    }

    public double montoARecuperar() {
        double aux = 0;
        if(diasFechaActualYEvento() >= 30)
            aux = evento.calcularAsistencia() * 0.5;
        if(seguro)
            aux += evento.calcularAsistencia() * 0.15;
        return aux;
    }
    private int diasFechaActualYEvento() {
        return new DateLapse(fechaC,evento.getFecha()).sizeInDays();
    }
    public double montoEntrada() {
        double aux = evento.calcularAsistencia();
        if(seguro)
            aux += 500;
        return aux;
    }
    public boolean posteriorAFechaActual() {
        return this.fechaC.isAfter(LocalDate.now());
    }
    public boolean compradaEntreFechas(DateLapse fechas) {
        return fechas.includesDate(this.fechaC);
    }
    public LocalDate getFechaC() {
        return fechaC;
    }
}

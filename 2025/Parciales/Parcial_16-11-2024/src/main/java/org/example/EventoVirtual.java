package org.example;

import java.time.LocalDate;

public class EventoVirtual extends Evento {
    private double precioEnvioR;

    public EventoVirtual(String nombre, LocalDate fecha, String temaP, double precioI, double precioR, double precioEnvioR) {
        super(nombre, fecha, temaP, precioI, precioR);
        this.precioEnvioR = precioEnvioR;
    }

    protected double extra() {
        return this.precioEnvioR;
    }
}

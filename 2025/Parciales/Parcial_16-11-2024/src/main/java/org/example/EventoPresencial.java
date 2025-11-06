package org.example;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class EventoPresencial extends Evento {
    private List<Sede> sedes;

    public EventoPresencial(String nombre, LocalDate fecha, String temaP, double precioI, double precioR, double precioEnvioR) {
        super(nombre, fecha, temaP, precioI, precioR);
        this.sedes = new LinkedList<>();
    }

    protected double extra() {
        return sedes.stream().mapToDouble(s -> s.precioTotal()).sum();
    }
}

package org.example;

import java.time.LocalDate;

public class Reserva {
    private DateLapse fechas;

    public Reserva(LocalDate desde, LocalDate hasta) {
        fechas = new DateLapse(desde, hasta);
    }

    public boolean estaOcupada(LocalDate desde, LocalDate hasta) {
        return fechas.overlaps(new DateLapse(desde,hasta));
    }
    public int cantidadDias() {
        return fechas.sizeInDays();
    }
    public boolean estaOcupadaAhora() {
        return fechas.includesDate(LocalDate.now());
    }
}
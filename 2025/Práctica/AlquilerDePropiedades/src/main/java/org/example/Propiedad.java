package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Propiedad {
    private String nombreDescriptivo;
    private String direccion;
    private double precio;
    private List<Reserva> reservas;

    public Propiedad(String nombreDescriptivo, String direccion, double precio) {
        this.nombreDescriptivo = nombreDescriptivo;
        this.direccion = direccion;
        this.precio = precio;
        reservas = new LinkedList<>();
    }

    public boolean disponibleEntreFechas(LocalDate desde, LocalDate hasta) {
        return reservas.stream().noneMatch(reserva -> reserva.estaOcupada(desde,hasta));
    }
    public Reserva crearReserva(LocalDate desde, LocalDate hasta) {
        if(disponibleEntreFechas(desde,hasta)) {
            Reserva r = new Reserva(desde, hasta);
            reservas.add(r);
            return r;
        }
        return null;
    }
    public boolean cancelarReserva(Reserva reserva) {
        if(!reserva.estaOcupadaAhora()) {
            reservas.remove(reserva);
            return true;
        }
        return false;
    }
    public double calcularPrecioReserva(Reserva reserva) {
        return reserva.cantidadDias() * precio;
    }
    public double montoEnFechas(LocalDate desde, LocalDate hasta) {
        return reservas.stream()
                .filter(reserva -> reserva.estaOcupada(desde, hasta))
                .mapToDouble(reserva -> calcularPrecioReserva(reserva))
                .sum();
    }
    public String getNombreDescriptivo() {
        return nombreDescriptivo;
    }
}

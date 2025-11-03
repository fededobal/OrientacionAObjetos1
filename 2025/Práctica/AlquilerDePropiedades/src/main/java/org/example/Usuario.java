package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String direccion;
    private int dni;
    private List<Propiedad> propiedades;

    public Usuario(String nombre, String direccion, int dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        propiedades = new LinkedList<>();
    }
    public double calcularIngresos(LocalDate desde, LocalDate hasta) {
        return propiedades.stream()
                .mapToDouble(propiedad -> propiedad.montoEnFechas(desde,hasta))
                .sum() * 0.75;
    }
    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }
    public Reserva crearReserva(String nombrePropiedad, LocalDate desde, LocalDate hasta) {
        Propiedad p = propiedades.stream()
                .filter(propiedad -> propiedad.getNombreDescriptivo().equals(nombrePropiedad))
                .findFirst()
                .orElse(null);
        if(p != null)
            p.crearReserva(desde,hasta);
        return null;
    }
    public boolean propiedadDisponibleEntreFechas(String nombrePropiedad, LocalDate desde, LocalDate hasta) {
        Propiedad p = propiedades.stream()
                .filter(propiedad -> propiedad.getNombreDescriptivo().equals(nombrePropiedad))
                .findFirst()
                .orElse(null);
        if(p != null)
            return p.disponibleEntreFechas(desde,hasta);
        return false;
    }
}

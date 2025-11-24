package org.example;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Contribuyente {
    private String nombre;
    private int DNI;
    private String email;
    private String localidad;
    private List<Bien> bienes;

    public Contribuyente(String nombre, int DNI, String email, String localidad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.email = email;
        this.localidad = localidad;
        this.bienes = new LinkedList<>();
    }

    public Inmueble agregarInmueble(String partida, double valorLote, double valorEdificacion) {
        Inmueble i = new Inmueble(partida,valorLote,valorEdificacion);
        this.bienes.add(i);
        return i;
    }

    public Automotor agregarAutomotor(String patente, LocalDate fechaFabricacion, String marca, double valor) {
        Automotor a = new Automotor(patente,marca,fechaFabricacion,valor);
        this.bienes.add(a);
        return a;
    }

    public Embarcacion agregarEmbarcacion(String patente, String nombre, LocalDate fechaFabricacion, double valor) {
        Embarcacion e = new Embarcacion(patente,nombre,fechaFabricacion,valor);
        this.bienes.add(e);
        return e;
    }

    public double montoAPagar() {
        return this.bienes.stream().mapToDouble(b -> b.calcularImpuesto()).sum();
    }

    public boolean esDeLocalidad(String localidad) {
        return this.localidad.equals(localidad);
    }
}

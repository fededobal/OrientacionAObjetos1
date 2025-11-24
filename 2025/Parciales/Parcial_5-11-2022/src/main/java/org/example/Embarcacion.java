package org.example;

import java.time.LocalDate;

public class Embarcacion extends Vehiculo {
    private String nombre;

    public Embarcacion(String patente, String nombre, LocalDate fechaFabricacion, double valor) {
        super(patente, fechaFabricacion, valor);
        this.nombre = nombre;
    }

    @Override
    protected double extraVehiculos() {
        if(getValor() < 1000000)
            return getValor() * 0.1;
        else
            return getValor() * 0.15;
    }
}

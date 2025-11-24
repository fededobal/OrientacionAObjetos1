package org.example;

import java.time.LocalDate;

public class Automotor extends Vehiculo {
    private String marca;

    public Automotor(String patente, String marca, LocalDate fechaFabricacion, double valor) {
        super(patente,fechaFabricacion,valor);
        this.marca = marca;
    }

    protected double extraVehiculos() {
        return getValor() * 0.05;
    }
}

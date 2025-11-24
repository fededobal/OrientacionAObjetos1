package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Vehiculo implements Bien {
    private String patente;
    private LocalDate fechaFabricacion;
    private double valor;

    public Vehiculo(String patente, LocalDate fechaFabricacion, double valor) {
        this.patente = patente;
        this.fechaFabricacion = fechaFabricacion;
        this.valor = valor;
    }

    @Override
    public double calcularImpuesto() {
        double aux = 0;
        if(ChronoUnit.YEARS.between(this.fechaFabricacion,LocalDate.now()) < 10)
            aux += this.extraVehiculos();
        return aux;
    }

    protected abstract double extraVehiculos();

    public double getValor() {
        return this.valor;
    }
}

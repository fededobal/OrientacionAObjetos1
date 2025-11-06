package org.example;

public class Individuo extends Cliente {
    private int DNI;

    public Individuo(String nombre, String direccion, int DNI) {
        super(nombre, direccion);
        this.DNI = DNI;
    }

    @Override
    public double montoEnvios(DateLapse fechas) {
        return super.montoEnvios(fechas) * 0.9;
    }
}

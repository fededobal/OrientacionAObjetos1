package org.example;

import java.util.LinkedList;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    private List<Envio> envios;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.envios = new LinkedList<>();
    }

    public void agregarEnvio(Envio e) {
        this.envios.add(e);
    }
    public double montoEnvios(DateLapse fechas) {
        return this.envios.stream()
                .filter(e -> e.perteneceAFechas(fechas))
                .mapToDouble(e -> e.costo())
                .sum();
    }
}

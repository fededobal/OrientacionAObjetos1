package org.example;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Usuario {
    private String nombre;
    private List<Entrada> entradas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.entradas = new LinkedList<>();
    }

    public Entrada comprarEntrada(Evento e, boolean seguro) {
        Entrada entrada = new Entrada(e,seguro);
        this.entradas.add(entrada);
        return entrada;
    }
    public double montoTotalEntradas(DateLapse fechas) {
        return this.entradas.stream()
                .filter(e -> e.compradaEntreFechas(fechas))
                .mapToDouble(e -> e.montoEntrada())
                .sum();
    }
    public Entrada retornarSiguienteEvento() {
        return this.entradas.stream()
                .filter(entrada -> entrada.posteriorAFechaActual())
                .min((ent1, ent2) -> ent1.getFechaC().compareTo(ent2.getFechaC()))
                .orElse(null);
    }
}

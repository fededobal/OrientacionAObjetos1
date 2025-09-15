package org.resolucion;

import java.util.LinkedList;
import java.util.List;

public class Inversor {
    private double valorInversionActual;
    private List<Inversion> cartera;

    public Inversor() {
        this.valorInversionActual = 0;
        this.cartera = new LinkedList<>();
    }

    public double getValorInversionActual() {
        return this.cartera.stream()
                .mapToDouble(Inversion::getValorActual)
                .sum();
    }

    public void agregarInversion(Inversion I) {
        this.cartera.add(I);
        valorInversionActual += I.getValorActual();
    }

    public Inversion sacarInversion(Inversion I) {
        if (this.cartera.remove(I)) {
            valorInversionActual -= I.getValorActual();
            return I;
        }
        return null;
    }
}

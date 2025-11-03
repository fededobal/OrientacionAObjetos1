package org.example;

import java.util.LinkedList;
import java.util.List;

public class ReporteDeConstruccion {
    private List<Pieza> piezas;

    public ReporteDeConstruccion() {
        piezas = new LinkedList<>();
    }

    public void agregarPieza(Pieza p) {
        piezas.add(p);
    }

    public double volumenDeMaterial(String material) {

    }

    public double superficieDeColor(String material) {

    }
}

package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ARBA {
    private List<Contribuyente> contribuyentes;

    public ARBA(String nombre, int DNI, String email, String localidad) {
        this.contribuyentes = new LinkedList<>();
        this.contribuyentes.add(new Contribuyente(nombre, DNI, email, localidad));
    }

    public void agregarContribuyente(String nombre, int DNI, String email, String localidad) {
        this.contribuyentes.add(new Contribuyente(nombre, DNI, email, localidad));
    }
    public List<Contribuyente> contribuyentesQuePaganMasEnLocalidad(String localidad, int N) {
        return this.contribuyentes.stream()
                .filter(c -> c.esDeLocalidad(localidad))
                .sorted((c1,c2) -> Double.compare(c2.montoAPagar(),c1.montoAPagar()))
                .collect(Collectors.toList())
                .stream()
                .limit(N)
                .collect(Collectors.toList());
    }
}

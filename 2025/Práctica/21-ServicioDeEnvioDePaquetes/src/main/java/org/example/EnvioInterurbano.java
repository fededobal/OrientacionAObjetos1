package org.example;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
    private double distancia;

    public EnvioInterurbano(LocalDate f, String dirO, String dirD, double p, double distancia) {
        super(f,dirO,dirD,p);
        this.distancia = distancia;
    }

    public double costo() {
        if(distancia < 100) return 20;
        if(distancia >= 100 && distancia <= 500) return 25;
        return 30;
    }
}

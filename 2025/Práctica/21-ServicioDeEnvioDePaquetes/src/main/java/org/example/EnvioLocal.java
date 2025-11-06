package org.example;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
    private boolean entregaR;

    public EnvioLocal(LocalDate f, String dirO, String dirD, double p, boolean entregaR) {
        super(f,dirO,dirD,p);
        this.entregaR = entregaR;
    }

    public double costo() {
        double aux = 1000;
        if (entregaR) aux += 500;
        return aux;
    }
}

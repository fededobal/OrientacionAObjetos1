package org.example;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {
    private boolean entregaR;

    public EnvioInternacional(LocalDate f, String dirO, String dirD, double p, boolean entregaR) {
        super(f,dirO,dirD,p);
        this.entregaR = entregaR;
    }

    public double costo() {
        double aux = 5000;
        if(getPeso() <= 1000)
            aux += 10 * getPeso();
        else
            aux += 12 * getPeso();
        if(entregaR)
            aux += 800;
        return aux;
    }
}

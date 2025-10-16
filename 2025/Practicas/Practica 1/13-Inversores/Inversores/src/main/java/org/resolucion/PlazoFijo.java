package org.resolucion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
    private double interes;
    private double montoDepositado;
    private LocalDate fechaConstitucion;

    public PlazoFijo(double interes, double montoDepositado) {
        this.interes = interes;
        this.montoDepositado = montoDepositado;
        this.fechaConstitucion = LocalDate.now();
    }

    @Override
    public double getValorActual() {
        long diasTranscurridos = ChronoUnit.DAYS.between(this.fechaConstitucion, LocalDate.now());
        double interesDiario = (this.interes / 100.0) / 365.0;
        double interesesGanados = this.montoDepositado * interesDiario * diasTranscurridos;
        return this.montoDepositado + interesesGanados;
    }

    public double getInteres() {
        return interes;
    }

    public double getMontoDepositado() {
        return montoDepositado;
    }

    public LocalDate getFechaConstitucion() {
        return fechaConstitucion;
    }
}

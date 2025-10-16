package org.example;

public class CuentaCorriente extends Cuenta {
    private double descubierto;

    public CuentaCorriente() {
        this.descubierto = 0;
    }

    public double getDescubierto() {
        return this.descubierto;
    }
    public void setDescubierto(double d) {
        this.descubierto = d;
    }
    protected boolean puedeExtraer(double monto) {
        return this.descubierto + getSaldo() >= monto;
    }

}

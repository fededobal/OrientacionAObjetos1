package org.example;

public class CajaDeAhorro extends Cuenta {

    protected boolean puedeExtraer(double monto) {
        return getSaldo() >= monto;
    }
    public boolean extraer(double monto) {
        return super.extraer(monto * 1.02);
    }
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
        return super.transferirACuenta(monto * 1.02,cuentaDestino);
    }
    public void depositar(double monto) {
        super.depositar(monto * 0.98);
    }
}

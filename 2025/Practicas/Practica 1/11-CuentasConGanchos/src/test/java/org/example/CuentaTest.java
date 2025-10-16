package org.example;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {
    private CajaDeAhorro cajaDeAhorro;
    private CuentaCorriente cuentaCorriente;

    @BeforeEach
    void construir() throws Exception {
        cajaDeAhorro = new CajaDeAhorro();
        cuentaCorriente = new CuentaCorriente();
    }

    @Test
    void testExtracciones() {
        cajaDeAhorro.depositar(500);
        assertFalse(cajaDeAhorro.extraer(501));
        assertTrue(cajaDeAhorro.extraer(450));
        cuentaCorriente.setDescubierto(100);
        assertFalse(cuentaCorriente.extraer(103));
        assertTrue(cuentaCorriente.extraer(50));
    }

    @Test
    void testTransferencias() {
        cajaDeAhorro.depositar(2);
        assertFalse(cajaDeAhorro.transferirACuenta(2,cuentaCorriente));
        assertTrue(cajaDeAhorro.transferirACuenta(1,cuentaCorriente));
        cuentaCorriente.depositar(50);
        assertFalse(cuentaCorriente.transferirACuenta(100,cajaDeAhorro));
        assertTrue(cuentaCorriente.transferirACuenta(50,cajaDeAhorro));
    }
}

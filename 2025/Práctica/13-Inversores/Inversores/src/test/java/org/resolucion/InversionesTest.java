package org.resolucion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InversionesTest {
    private Inversion inversion1;
    private Inversion inversion2;
    private Inversion inversion3;
    private Inversor inversor;

    @BeforeEach
    void construccion() {
        inversor = new Inversor();
        inversion1 = new Accion(1000,5,"BTC");
        inversion2 = new PlazoFijo(30,500000);
        inversion3 = new Accion(500,10,"ETH");
        inversor.agregarInversion(inversion1);
        inversor.agregarInversion(inversion2);
        inversor.agregarInversion(inversion3);
    }

    @Test
    void testInversiones() {
        assertEquals(510000,inversor.getValorInversionActual());
        assertEquals(inversion3,inversor.sacarInversion(inversion3));
        assertEquals(505000,inversor.getValorInversionActual());
        assertNull(inversor.sacarInversion(inversion3));
    }
}

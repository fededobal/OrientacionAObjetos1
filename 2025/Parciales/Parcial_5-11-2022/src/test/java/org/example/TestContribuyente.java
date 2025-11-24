/*

Clase: Contribuyente
Métodos:
    - public double montoAPagar()
Atributos en juego:
    - List<Bien> bienes

Casos de prueba
    Partición A1: Contribuyente no posee bienes
        - Lista vacía
        - Debe retornar 0
    Partición A2: Contribuyente posee bienes
        - Valor borde mínimo: 1

    Dentro de la partición A2, encontramos las siguientes:
    Partición B1: Embarcación con más de 10 años de antigüedad
        - Valor borde mínimo: 11 años
        - Debe retornar 0
    Partición B2: Embarcación con 10 años de antigüedad
        - Valor: 10 años
    Partición B3: Embarcación con menos de 10 años de antigüedad
        - Valor borde máximo: 9 años
    Las particiones B2 y B3 son equivalentes, por lo que quedarían agrupadas en la siguiente partición:
    Partición B2: Embarcación con 10 o menos años de antigüedad
        - Valor borde máximo: 10 años

    Dentro de la partición B2, encontramos las siguientes:
    Partición C1: Embarcación valuada en menos de 1 millón
        - Valor borde máximo: 999999
        - Debe retornar 99999,9
    Partición C2: Embarcación valuada en 1 millón
        - Valor: 1000000
    Partición C3 Embarcación valuada en más de 1 millón
        - Valor borde mínimo: 1000001

    Las particiones C2 y C3 son equivalentes, por lo que quedarían agrupadas en la siguiente partición:
    Partición C2: Contribuyente posee una embarcación valuada en 1 millón o más
        - Valor borde mínimo: 1000000
        - Debe retornar 150000

    A partir de todas estas particiones, podemos formar las siguientes combinaciones:
        A1: debe retornar 0
        A2 y B1: debe retornar 0
        A2, B2 y C1: debe retornar 99999,9
        A2, B2 y C2: debe retornar 150000
*/

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContribuyente {
    Contribuyente c;

    @BeforeEach
    void setUp() {
         c = new Contribuyente("Sandra",112233,"aa@gmail.com","La Plata");
    }

    @Test // A1
    void testImpuestos1() {
        assertEquals(0, c.montoAPagar());
    }

    @Test // A2 y B1
    void testImpuestos2() {
        c.agregarEmbarcacion("AA11BB","Barquito", LocalDate.of(2014,5,12),999999);
        assertEquals(0, c.montoAPagar());
    }

    @Test // A2, B2 y C1
    void testImpuestos3() {
        c.agregarEmbarcacion("AA11BB","Barquito", LocalDate.of(2024,5,12),999999);
        assertEquals(99999.9, Math.round(c.montoAPagar() * 100.00) / 100.00);
    }

    @Test // A2, B2 y C2
    void testImpuestos4() {
        c.agregarEmbarcacion("AA11BB","Barquito", LocalDate.of(2024,5,12),1000000);
        assertEquals(150000, Math.round(c.montoAPagar()));
    }
}
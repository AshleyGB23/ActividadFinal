/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

/**
 *
 * @author Ashley
 */
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Prueba unitaria para la clase NumeroRango.
 */
public class NumeroRangoTest {

    /**
     * Prueba el método imprimirNumerosEnRango con dos números positivos.
     */
    @Test
    public void testImprimirNumerosEnRango_NumerosPositivos() {
        NumeroRango rango = new NumeroRango();
        List<Integer> numerosEnRango = rango.imprimirNumerosEnRango(2, 6);

        assertEquals(3, numerosEnRango.size());
        assertEquals(Integer.valueOf(3), numerosEnRango.get(0));
        assertEquals(Integer.valueOf(4), numerosEnRango.get(1));
        assertEquals(Integer.valueOf(5), numerosEnRango.get(2));
    }

    /**
     * Prueba el método imprimirNumerosEnRango con un número negativo y un número positivo.
     */
    @Test
    public void testImprimirNumerosEnRango_NumerosNegativosYPositivos() {
        NumeroRango rango = new NumeroRango();
        List<Integer> numerosEnRango = rango.imprimirNumerosEnRango(-5, 2);

        assertEquals(6, numerosEnRango.size());
        assertEquals(Integer.valueOf(-4), numerosEnRango.get(0));
        assertEquals(Integer.valueOf(-3), numerosEnRango.get(1));
        assertEquals(Integer.valueOf(-2), numerosEnRango.get(2));
        assertEquals(Integer.valueOf(-1), numerosEnRango.get(3));
        assertEquals(Integer.valueOf(0), numerosEnRango.get(4));
        assertEquals(Integer.valueOf(1), numerosEnRango.get(5));
    }
}

package de.thm.swep.unittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaschenrechnerTestClaude {
    private Taschenrechner calculator;

    @Before
    public void setUp() {
        calculator = new Taschenrechner();
    }

    // Tests für addieren()
    @Test
    public void testAddierenPositiveZahlen() {
        double result = calculator.addieren(5, 3);
        assertEquals(8, result, 0.0001);
    }

    @Test
    public void testAddierenNegativeZahlen() {
        double result = calculator.addieren(-5, -3);
        assertEquals(-8, result, 0.0001);
    }

    @Test
    public void testAddierenMitNull() {
        double result = calculator.addieren(5, 0);
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void testAddierenPositivUndNegativ() {
        double result = calculator.addieren(10, -7);
        assertEquals(3, result, 0.0001);
    }

    @Test
    public void testAddierenKommazahlen() {
        double result = calculator.addieren(2.5, 3.7);
        assertEquals(6.2, result, 0.0001);
    }

    // Tests für subtrahieren()
    @Test
    public void testSubtrahierenPositiveZahlen() {
        double result = calculator.subtrahieren(10, 4);
        assertEquals(6, result, 0.0001);
    }

    @Test
    public void testSubtrahierenNegativeZahlen() {
        double result = calculator.subtrahieren(-5, -3);
        assertEquals(-2, result, 0.0001);
    }

    @Test
    public void testSubtrahierenErgebnisNegativ() {
        double result = calculator.subtrahieren(3, 8);
        assertEquals(-5, result, 0.0001);
    }

    @Test
    public void testSubtrahierenMitNull() {
        double result = calculator.subtrahieren(7, 0);
        assertEquals(7, result, 0.0001);
    }

    @Test
    public void testSubtrahierenKommazahlen() {
        double result = calculator.subtrahieren(5.8, 2.3);
        assertEquals(3.5, result, 0.0001);
    }

    // Tests für multiplizieren()
    @Test
    public void testMultiplizierenPositiveZahlen() {
        double result = calculator.multiplizieren(4, 5);
        assertEquals(20, result, 0.0001);
    }

    @Test
    public void testMultiplizierenNegativeZahlen() {
        double result = calculator.multiplizieren(-3, -4);
        assertEquals(12, result, 0.0001);
    }

    @Test
    public void testMultiplizierenPositivUndNegativ() {
        double result = calculator.multiplizieren(6, -2);
        assertEquals(-12, result, 0.0001);
    }

    @Test
    public void testMultiplizierenMitNull() {
        double result = calculator.multiplizieren(5, 0);
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void testMultiplizierenKommazahlen() {
        double result = calculator.multiplizieren(2.5, 4.0);
        assertEquals(10.0, result, 0.0001);
    }

    @Test
    public void testMultiplizierenMitEins() {
        double result = calculator.multiplizieren(7, 1);
        assertEquals(7, result, 0.0001);
    }

    // Tests für dividieren()
    @Test
    public void testDividierenPositiveZahlen() {
        double result = calculator.dividieren(15, 3);
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void testDividierenNegativeZahlen() {
        double result = calculator.dividieren(-12, -4);
        assertEquals(3, result, 0.0001);
    }

    @Test
    public void testDividierenPositivUndNegativ() {
        double result = calculator.dividieren(20, -5);
        assertEquals(-4, result, 0.0001);
    }

    @Test
    public void testDividierenNullDurchZahl() {
        double result = calculator.dividieren(0, 5);
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void testDividierenKommazahlen() {
        double result = calculator.dividieren(7.5, 2.5);
        assertEquals(3, result, 0.0001);
    }

    @Test
    public void testDividierenDurchEins() {
        double result = calculator.dividieren(9, 1);
        assertEquals(9, result, 0.0001);
    }

    @Test
    public void testDividierenErgebnisKommazahl() {
        double result = calculator.dividieren(5, 2);
        assertEquals(2.5, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividierenDurchNull() {
        calculator.dividieren(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividierenNegativDurchNull() {
        calculator.dividieren(-5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividierenNullDurchNull() {
        calculator.dividieren(0, 0);
    }
}

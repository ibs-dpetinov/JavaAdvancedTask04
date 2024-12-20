package test;

import calculator.Fraction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void testAddition() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Fraction result = firstFraction.add(secondFraction);
        assertEquals("1/1", result.toString());
    }

    @Test
    void testSubtraction() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Fraction result = firstFraction.subtract(secondFraction);
        assertEquals("0/1", result.toString());
    }

    @Test
    void testMultiplication() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Fraction result = firstFraction.multiply(secondFraction);
        assertEquals("1/4", result.toString());
    }

    @Test
    void testDivision() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Fraction result = firstFraction.divide(secondFraction);
        assertEquals("1/1", result.toString());
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals("1/2", fraction.toString());
    }
}
package test;
import calculator.Calculator;
import calculator.Fraction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Calculator calculator = new Calculator(firstFraction, secondFraction, '+');
        assertEquals("1/1", calculator.getOperationDescription());
    }

    @Test
    void testSubtraction() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Calculator calculator = new Calculator(firstFraction, secondFraction, '-');
        assertEquals("0/1", calculator.getOperationDescription());
    }

    @Test
    void testMultiplication() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Calculator calculator = new Calculator(firstFraction, secondFraction, '*');
        assertEquals("1/4", calculator.getOperationDescription());
    }

    @Test
    void testDivision() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Calculator calculator = new Calculator(firstFraction, secondFraction, '/');
        assertEquals("1/1", calculator.getOperationDescription());
    }

    @Test
    void testInvalidOperation() {
        Fraction firstFraction = new Fraction(1, 2);
        Fraction secondFraction = new Fraction(1, 2);
        Calculator calculator = new Calculator(firstFraction, secondFraction, 'x');
        assertEquals("Invalid operation! Cannot calculate.", calculator.getOperationDescription());
    }
}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import calculator.Calculator;
public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        Calculator calculator = new calculator.Calculator();
        double result = calculator.squareRoot(16);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testFactorial() {
        Calculator calculator = new Calculator();
        double result = calculator.fact(5);
        assertEquals(120, result);
    }

    @Test
    public void testNaturalLogarithm() {
        Calculator calculator = new Calculator();
        double result = calculator.naturalLog(10);
        assertEquals(2.302585092994046, result, 0.0001);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        double result = calculator.power(2, 3);
        assertEquals(8.0, result, 0.0001);
    }
}

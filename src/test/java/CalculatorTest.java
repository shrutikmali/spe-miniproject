import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.Calculator;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calcuator = new Calculator();
        assertEquals("1.0", calcuator.addition(1.0, 1.0));
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        assertEquals("2.0", calculator.subtraction(3.0, 1.0));
    }

    @Test
    public void multiplication() {
        Calculator calculator = new Calculator();
        assertEquals("25.0", calculator.multiplication(5.0, 5.0));
    }

    @Test
    public void division() {
        Calculator calculator = new Calculator();
        assertEquals("5.0", calculator.division(25.0, 5.0));
    }

    public void divisionZero() {
        Calculator calculator = new Calculator();
        assertEquals("Cannot divide by 0", calculator.division(5.0, 0.0));
    }

    @Test
    public void squareRoot() {
        Calculator calculator = new Calculator();
        assertEquals("5.0", calculator.squareRoot(25.0));
    }

    @Test
    public void squareRootNegative() {
        Calculator calculator = new Calculator();
        assertEquals("Cannot have square root of negative number", calculator.squareRoot(-25.0));
    }

    @Test
    public void factorial() {
        Calculator calculator = new Calculator();
        assertEquals("120", calculator.factorial(5));
    }

    @Test
    public void factorialNegative() {
        Calculator calculator = new Calculator();
        assertEquals("Cannot have factorial of negative number", calculator.factorial(-3));
    }

    @Test
    public void naturalLog() {
        Calculator calculator = new Calculator();
        assertEquals("1.0", calculator.naturalLog(Math.exp(1)));
    }

    @Test
    public void naturalLogZero() {
        Calculator calculator = new Calculator();
        assertEquals("Cannot have natural log of 0 or negative", calculator.naturalLog(0));
    }

    @Test
    public void naturalLogNegative() {
        Calculator calculator = new Calculator();
        assertEquals("Cannot have natural log of 0 or negative", calculator.naturalLog(-12.0));
    }

    @Test
    public void exponentiation() {
        Calculator calculator = new Calculator();
        assertEquals("8.0", calculator.exponentiation(2.0, 3.0));
    }
}

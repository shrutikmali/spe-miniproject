import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.Calculator;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calcuator = new Calculator();
        assertEquals("2.0", calcuator.addition(1.0, 1.0));
    }
}

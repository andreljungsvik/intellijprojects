import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionExampleTest {
    @Test
    public void testDivideByZero() {
        ExceptionExample ex = new ExceptionExample();
        assertThrows(ArithmeticException.class, () -> {
            ex.divide(10, 0);
        }, "Dividing by zero should throw ArithmeticException");
    }
}

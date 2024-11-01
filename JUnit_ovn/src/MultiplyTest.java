import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MultiplyTest {

    @Test
    public void testNotEquals() {
        Multiply mult = new Multiply();
        assertNotEquals(11, mult.multiply(5, 2), "5 * 2 != 11");
    }
    @Test
    public void testEquals() {
        Multiply mult = new Multiply();
        assertEquals(10, mult.multiply(5, 2), "5 * 2 = 10");
    }
}

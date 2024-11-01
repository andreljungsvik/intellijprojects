import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MultTest {

    @Test
    public void testNotEquals() {
        Mult mult = new Mult();
        assertNotEquals(11, mult.multiply(5, 2), "5 * 2 != 11");
    }
    @Test
    public void testEquals() {
        Mult mult = new Mult();
        assertEquals(10, mult.multiply(5, 2), "5 * 2 = 10");
    }
}

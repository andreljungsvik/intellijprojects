import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeAllExampleTest {
    @BeforeAll
    public static void setUp() {
        BeforeAllExample.setInitialValue(42);
    }
    @Test
    public void testGetInitialValue() {
        assertEquals(42, BeforeAllExample.getInitialValue(), "should return 42");
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeEachExampleTest {

    private BeforeEachExample example;

    @BeforeEach
    public void setUp() {
        example = new BeforeEachExample();
        example.setValue(42);
    }

    @Test
    public void testGetValue() {
        assertEquals(42, example.getValue(), "getValue should return 42");
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatedTestExampleTest {
    @Test
    public void testAddPositive() {
        RepeatedTestExample test = new RepeatedTestExample();
        assertEquals(10, test.add(5, 5),"5 + 5 = 10");
    }

    @Test
    public void testAddNegative() {
        RepeatedTestExample test = new RepeatedTestExample();
        assertEquals(-10, test.add(5, -5),"5 - 5 = 10");
    }

    @Test
    public void testAddZero() {
        RepeatedTestExample test = new RepeatedTestExample();
        assertEquals(5, test.add(0, 5),"0 + 5 = 5");
    }

    @Test
    public void testAddPositiveAndNegative() {
        RepeatedTestExample test = new RepeatedTestExample();
        assertEquals(5, test.add(10, -5),"10 - 5 = 5");
    }
}

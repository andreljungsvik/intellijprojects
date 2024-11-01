import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckerTest {
    @Test
    public void testAssertTrue() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("deed"), "should be true");
        assertTrue(checker.isPalindrome("level"), "should be true");
    }
    @Test
    public void testAssertFalse() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"), "should be false");
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void givenPalindromeWhenCheckingIsPalindromeThenTrue() {
        assertTrue(Palindrome.isPalindrome("Kayak"));
    }

    @Test
    void givenNonPalindromeWhenCheckingIsPalindromeThenFalse() {
        assertFalse(Palindrome.isPalindrome("Omar"));
    }

    @Test
    void givenMixedCasePalindromeWhenCheckingIsPalindromeThenTrue() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }

    @Test
    void givenNullWhenCheckingIsPalindromeThenNullPointerException() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}

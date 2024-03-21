import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void givenAnagramsWhenCheckingIsAnagramThenTrue() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    void givenNonAnagramsWhenCheckingIsAnagramThenFalse() {
        assertFalse(Anagram.isAnagram("test", "best"));
    }

    @Test
    void givenNullInputsWhenCheckingIsAnagramThenNullPointerException() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    void givenDifferentLengthStringsWhenCheckingIsAnagramThenFalse() {
        assertFalse(Anagram.isAnagram("tests", "best"));
    }
}

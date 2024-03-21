import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void givenElementInArrayWhenBinarySearchingThenCorrectIndex() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
    }

    @Test
    void givenElementNotInArrayWhenBinarySearchingThenMinusOne() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 4));
    }

    @Test
    void givenNullArrayWhenBinarySearchingThenNullPointerException() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }
}

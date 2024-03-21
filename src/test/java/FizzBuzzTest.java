import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void givenNumberDivisibleByThreeWhenFizzBuzzingThenFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void givenNumberDivisibleByFiveWhenFizzBuzzingThenBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void givenNumberDivisibleByThreeAndFiveWhenFizzBuzzingThenFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void givenPositiveNumberNotDivisibleByThreeOrFiveWhenFizzBuzzingThenNumberAsString() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    void givenNegativeNumberOrOneWhenFizzBuzzingThenIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-1));
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(1));
    }
}

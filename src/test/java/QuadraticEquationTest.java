import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void givenTwoRealSolutionsWhenSolvingQuadraticEquationThenCorrectSolutions() {
        assertArrayEquals(new double[]{1, -3}, QuadraticEquation.solve(1, 2, -3));
    }

    @Test
    void givenOneRealSolutionWhenSolvingQuadraticEquationThenCorrectSolution() {
        assertArrayEquals(new double[]{2}, QuadraticEquation.solve(1, -4, 4));
    }

    @Test
    void givenNoRealSolutionWhenSolvingQuadraticEquationThenNull() {
        assertNull(QuadraticEquation.solve(1, 1, 1));
    }

    @Test
    void givenAIsZeroWhenSolvingQuadraticEquationThenIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1));
    }
}

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        // Arrange
        int n = 5;
        int expectedResult = 3;

        // Act
        int result = Fibonacci.fibonacci(n);

        // Assert
        assertEquals(expectedResult, result);
    }
}
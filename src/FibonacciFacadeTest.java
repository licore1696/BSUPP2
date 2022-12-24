import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FibonacciFacadeTest {

    @Test
    public void testGetNthFibonacciNumber() {
        // Arrange
        FibonacciFacade facade = new FibonacciFacade();
        int n = 5;
        int expectedResult = 3;

        // Act
        int result = facade.getNthFibonacciNumber(n);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetFirstNFibonacciNumbers() {
        // Arrange
        FibonacciFacade facade = new FibonacciFacade();
        int n = 5;
        int[] expectedResult = new int[] {0, 1, 1, 2, 3};

        // Act
        int[] result = facade.getFirstNFibonacciNumbers(n);

        // Assert
        assertArrayEquals(expectedResult, result);
    }
}
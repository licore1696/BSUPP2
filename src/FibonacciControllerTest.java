public class FibonacciControllerTest {

    @Test
    public void testGetNthFibonacciNumber() {
        // Arrange
        int n = 5;
        int expectedResult = 3;

        // Act
        int result = given()
                .pathParam("n", n)
                .when()
                .get("/fibonacci/{n}")
                .then()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .as(int.class);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetFirstNFibonacciNumbers() {
        // Arrange
        int n = 5;
        int[] expectedResult = new int[] {0, 1, 1, 2, 3};

        // Act
        int[] result = given()
                .pathParam("n", n)
                .when()
                .get("/fibonacci/series/{n}")
                .then()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .as(int[].class);

        // Assert
        assertArrayEquals(expectedResult, result);
    }
}
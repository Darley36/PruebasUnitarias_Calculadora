package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


    @Test
    @DisplayName("Testing sum: 8-6=2")
    public void subtract() {
        // Arrange
        Long number1 = 8L;
        Long number2 = 6L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing various subtractions")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "1,    8,   -7",
            "491,  51, 440",
            "105,  100, 5"
    })
    public void severalSubtractions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing sum: 2*6=12")
    public void multiplication() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 6L;
        Long expectedValue = 12L;

        // Act
        Long result = basicCalculator.multiplication(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing various multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    8,   8",
            "4,  51, 204",
            "-10,  100, -1000"
    })
    public void severalMultiplications(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplication(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }


    @Test
    @DisplayName("Testing sum: 8-4=2")
    public void division() {
        // Arrange
        Long number1 = 8L;
        Long number2 = 4L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing various multiplications")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "6,    2,   3",
            "4,  4, 1",
            "-10,  1, -10"
    })
    public void severalDivisions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }
}

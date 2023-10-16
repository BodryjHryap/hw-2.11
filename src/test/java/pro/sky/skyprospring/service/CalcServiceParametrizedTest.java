package pro.sky.skyprospring.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceParametrizedTest {

    private final CalcService calcService = new CalcService();

    public static Stream<Arguments> additionParams() {
        return Stream.of(
                Arguments.of("2", "2", "2 + 2 = 4"),
                Arguments.of("23", "4", "23 + 4 = 27"),
                Arguments.of("154", "2", "154 + 2 = 156"),
                Arguments.of("51", "123", "51 + 123 = 174"),
                Arguments.of("10", "0", "10 + 0 = 10")
        );
    }

    @ParameterizedTest
    @MethodSource("additionParams")
    void addition(int n1, int n2, String result) {
        assertEquals(result, calcService.addition(n1, n2));
    }

    public static Stream<Arguments> subtractionParams() {
        return Stream.of(
                Arguments.of("2", "2", "2 - 2 = 0"),
                Arguments.of("23", "4", "23 - 4 = 19"),
                Arguments.of("154", "2", "154 - 2 = 152"),
                Arguments.of("51", "123", "51 - 123 = -72"),
                Arguments.of("10", "0", "10 - 0 = 10")
        );
    }

    @ParameterizedTest
    @MethodSource("subtractionParams")
    void subtraction(int n1, int n2, String result) {
        assertEquals(result, calcService.subtraction(n1, n2));
    }

    public static Stream<Arguments> multiplicationParams() {
        return Stream.of(
                Arguments.of("2", "2", "2 x 2 = 4"),
                Arguments.of("23", "4", "23 x 4 = 92"),
                Arguments.of("154", "2", "154 x 2 = 308"),
                Arguments.of("51", "123", "51 x 123 = 6273"),
                Arguments.of("10", "0", "10 x 0 = 0")
        );
    }

    @ParameterizedTest
    @MethodSource("multiplicationParams")
    void multiplication(int n1, int n2, String result) {
        assertEquals(result, calcService.multiplication(n1, n2));
    }

    public static Stream<Arguments> divisionParams() {
        return Stream.of(
                Arguments.of("2", "2", "2 / 2 = 1.0"),
                Arguments.of("24", "3", "24 / 3 = 8.0"),
                Arguments.of("154", "2", "154 / 2 = 77.0"),
                Arguments.of("51", "51", "51 / 51 = 1.0"),
                Arguments.of("10", "1", "10 / 1 = 10.0")
        );
    }

    @ParameterizedTest
    @MethodSource("divisionParams")
    void division(int n1, int n2, String result) {
        assertEquals(result, calcService.division(n1, n2));
    }
}
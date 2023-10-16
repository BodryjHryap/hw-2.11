package pro.sky.skyprospring.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {

    private final CalcService calcService = new CalcService();

    @Test
    void hello_success() {
         //Подготовка ожидаемого результата
        String expectedMessage = "Добро пожаловать в калькулятор";

        //Начало теста
        String actualMessage = calcService.hello();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void addition_success() {
        //Подготовка входных данных
        int n1 = 2;
        int n2 = 3;

        //Подготовка ожидаемого результата
        int expectedResult = n1 + n2;
        String expectedString = n1 + " + " + n2 + " = " + expectedResult;

        //Начало теста
        String actualResult = calcService.addition(n1, n2);
        assertEquals(expectedString, actualResult);
    }

    @Test
    void addition_success2() {
        //Подготовка входных данных
        int n1 = 71;
        int n2 = 33;

        //Подготовка ожидаемого результата
        int expectedResult = n1 + n2;
        String expectedString = n1 + " + " + n2 + " = " + expectedResult;

        //Начало теста
        String actualResult = calcService.addition(n1, n2);
        assertEquals(expectedString, actualResult);
    }

    @Test
    void subtraction_success() {
        //Подготовка входных данных
        int n1 = 2;
        int n2 = 3;

        //Подготовка ожидаемого результата
        int expectedResult = n1 - n2;
        String expectedString = n1 + " - " + n2 + " = " + expectedResult;

        //Начало теста
        String actualResult = calcService.subtraction(n1, n2);
        assertEquals(expectedString, actualResult);
    }

    @Test
    void subtraction_success2() {
        //Подготовка входных данных
        int n1 = 541;
        int n2 = 24;

        //Подготовка ожидаемого результата
        int expectedResult = n1 - n2;
        String expectedString = n1 + " - " + n2 + " = " + expectedResult;

        //Начало теста
        String actualResult = calcService.subtraction(n1, n2);
        assertEquals(expectedString, actualResult);
    }

    @Test
    void multiplication_success() {
        //Подготовка входных данных
        int n1 = 2;
        int n2 = 3;

        //Подготовка ожидаемого результата
        int expectedResult = n1 * n2;
        String expectedString = n1 + " x " + n2 + " = " + expectedResult;

        //Начало теста
        String actualResult = calcService.multiplication(n1, n2);
        assertEquals(expectedString, actualResult);
    }

    @Test
    void multiplication_success2() {
        //Подготовка входных данных
        int n1 = 413;
        int n2 = 23;

        //Подготовка ожидаемого результата
        int expectedResult = n1 * n2;
        String expectedString = n1 + " x " + n2 + " = " + expectedResult;

        //Начало теста
        String actualResult = calcService.multiplication(n1, n2);
        assertEquals(expectedString, actualResult);
    }

    @Test
    void division_success() {
        //Подготовка входных данных
        int n1 = 2;
        int n2 = 3;

        //Подготовка ожидаемого результата
        double expectedResult = (double) n1 / n2;
        String expectedString = n1 + " / " + n2 + " = " + expectedResult;

        //Начало теста
        String actualResult = calcService.division(n1, n2);
        assertEquals(expectedString, actualResult);
    }

    @Test
    void division_success2() {
        //Подготовка входных данных
        int n1 = 41;
        int n2 = 25;

        //Подготовка ожидаемого результата
        double expectedResult = (double) n1 / n2;
        String expectedString = n1 + " / " + n2 + " = " + expectedResult;

        //Начало теста
        String actualResult = calcService.division(n1, n2);
        assertEquals(expectedString, actualResult);
    }

    @Test
    void division_withException() {
        //Подготовка входных данных
        int n1 = 30;
        int n2 = 0;

        //Подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя";

        //Начало теста
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calcService.division(n1, n2));
        assertEquals(expectedMessage, exception.getMessage());
    }
}
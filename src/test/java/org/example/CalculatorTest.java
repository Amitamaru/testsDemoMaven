package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @AfterEach
    public void destroy() {
        calculator = null;
    }


    @ParameterizedTest
    @CsvSource({"2, 3, 5",
                "4, 4, 8"})
    void addTest(int a, int b, int expected) {

        int actual = calculator.add(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"3, 2, 1",
                "6, 1, 5"})
    void subTest(int a, int b, int expected) {
        int actual = calculator.sub(a, b);
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({"2, 3, 6",
            "4, 4, 16"})
    void mulTest(int a, int b, int expected) {
        int actual = calculator.mul(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"3, 3, 1",
            "4, 4, 1"})
    void divTest(int a, int b, int expected) {
        int actual = calculator.div(a, b);
        assertEquals(expected, actual);
    }
}
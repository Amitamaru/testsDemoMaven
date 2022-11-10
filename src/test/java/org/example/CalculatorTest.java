package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void addTest() {
        int a = 3;
        int b = 2;
        int actual = calculator.add(a, b);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void subTest() {
        int a = 3;
        int b = 2;
        int actual = calculator.sub(a, b);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void mulTest() {
        int a = 3;
        int b = 2;
        int actual = calculator.mul(a, b);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void divTest() {
        int a = 3;
        int b = 2;
        int actual = calculator.div(a, b);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
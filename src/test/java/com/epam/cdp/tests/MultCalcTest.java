package com.epam.cdp.tests;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultCalcTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        calculator = null;
    }

    @Test
    public void positiveLongMultTest() {
        assertEquals(8, calculator.mult(2,4));
    }

    // this test fails because of Math.floor method usage
    @Test
    public void positiveDoubleMultTest() {
        double result = calculator.mult(2.1, 4);
        assertEquals(8.4, result, 0.01);
    }

    @Test
    public void positiveMultTestWithNegativeNumbers() {
        assertEquals(-315, calculator.mult(-7, 45));
    }

    @Test
    public void zeroMultTest() {
        assertEquals(0.0, calculator.mult(7.12, 0), 0.01);
    }
}

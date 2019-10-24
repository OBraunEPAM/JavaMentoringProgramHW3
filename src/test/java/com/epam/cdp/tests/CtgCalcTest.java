package com.epam.cdp.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CtgCalcTest extends BaseTest {

    // this test fails because there is hyperbolic tangent returned value in Calculator.ctg method
    @Test(groups = "trigonometry")
    public void ctgTest() {
        assertEquals(calculator.ctg(Math.PI / 4), 1.0);
    }

    // this test fails because there is hyperbolic tangent returned value in Calculator.ctg method
    @Test(groups = "trigonometry")
    public void ctgZeroDivisionTest() {
        assertEquals(calculator.ctg(Math.PI), Double.POSITIVE_INFINITY);
    }

    // this test fails because there is hyperbolic tangent returned value in Calculator.ctg method
    @Test(groups = "trigonometry")
    public void ctgZeroTest() {
        assertEquals(calculator.tg(Math.PI / 2), 0.0);
    }
}

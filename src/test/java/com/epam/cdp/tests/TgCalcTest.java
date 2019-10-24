package com.epam.cdp.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TgCalcTest extends BaseTest {

    @Test(groups = "trigonometry")
    public void tngTest() {
        assertEquals(calculator.tg(45), 1.0);
    }

    // this test fails because there is sin as returned value in Calculator.cos method
    @Test(groups = "trigonometry")
    public void tngZeroDivisonTest() {
        assertEquals(calculator.tg(90), Double.POSITIVE_INFINITY);
    }

    // this test fails because there is sin as returned value in Calculator.cos method
    @Test(groups = "trigonometry")
    public void tngZeroTest() {
        assertEquals(calculator.tg(0), 0);
    }
}

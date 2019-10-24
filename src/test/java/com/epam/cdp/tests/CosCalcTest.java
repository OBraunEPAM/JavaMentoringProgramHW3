package com.epam.cdp.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import static java.lang.Math.PI;

public class CosCalcTest extends BaseTest {

    // this test suite entirely fails because there is a Math.sin as returned value in Calculator.cos method

    @Test(groups = "trigonometry")
    public void cosTest() {
        Assert.assertEquals(0.5, calculator.cos(PI / 3), 0.1);
    }

    @Test(groups = "trigonometry")
    public void cosZeroTest() {
        Assert.assertEquals(1, calculator.cos(0), 0.1);
    }

    @Test(groups = "trigonometry")
    public void cosNegativeNumberTest() {
        Assert.assertEquals(-0.87, calculator.cos(7 * PI / 6), 0.1);
    }
}

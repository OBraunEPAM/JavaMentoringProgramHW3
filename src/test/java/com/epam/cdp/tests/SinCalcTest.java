package com.epam.cdp.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import static java.lang.Math.PI;


public class SinCalcTest extends BaseTest {

    @Test(groups = "trigonometry")
    public void sinTest() {
        Assert.assertEquals(0.87, calculator.sin(PI / 3), 0.1);
    }

    @Test(groups = "trigonometry")
    public void sinZeroTest() {
        Assert.assertEquals(0, calculator.sin(0), 0.1);
    }

    @Test(groups = "trigonometry")
    public void sinNegativeNumberTest() {
        Assert.assertEquals(-0.707, calculator.sin(5 * PI / 4), 0.1);
    }
}

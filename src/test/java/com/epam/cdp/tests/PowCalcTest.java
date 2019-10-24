package com.epam.cdp.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PowCalcTest extends BaseTest {

    @Test(dataProvider = "dataForTest")
    public void powTest(double a, double b, double expectedResult) {
        assertEquals(calculator.pow(a, b), expectedResult);
    }

    // test with fractionalization fails because of Math.floor usage in Calculator.pow() method
    @DataProvider
    public Object[][] dataForTest() {
        return new Object[][] {
                {2, 4, 16},
                {0, 2, 0},
                {4, -3, 0.015625},
                {25, 0.5, 5.0},
                {5, 0, 1},
                {-4, 3, -64},
                {3, 1, 3},
                {0, 0, 1}
        };
    }
}

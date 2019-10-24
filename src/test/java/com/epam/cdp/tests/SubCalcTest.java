package com.epam.cdp.tests;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubCalcTest extends BaseTest {

    @Test(dataProvider = "longValuesForTest", groups = "basic operations")
    public void subLongTest(long a, long b, long expectedResult) {
        long result = calculator.sub(a, b);
        assertEquals(result, expectedResult, "Invalid result of subtraction operation!");
    }

    @Test(dataProvider = "doubleValuesForTest", groups = "basic operations")
    public void subDoubleTest(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(expectedResult, result, 0.01);
    }

    @DataProvider(name = "longValuesForTest")
    public Object[][] longValuesForSum() {
        return new Object[][] {
                {10, 23, -13},
                {23, 10, 13},
                {-10, 23, -33},
                {-10,-23, 13},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "doubleValuesForTest")
    public Object[][] doubleValuesForSum() {
        return new Object[][] {
                {10.45, 23.57, -13.12},
                {23.778, 10.01, 13.768},
                {-88.01, 1.2, -89.21},
        };
    }
}

package com.epam.cdp.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumCalcTest extends BaseTest{

    @Test(dataProvider = "longValuesForTest", groups = "basic operations")
    public void sumTest(long a, long b, long expectedValue) {
        long result = calculator.sum(a, b);
        assertEquals(result, expectedValue, "Invalid result of sum operation!");
    }

    @Test(dataProvider = "longValuesForTest", groups = "basic operations")
    public void sumTest(double a, double b, double expectedValue) {
        double result = calculator.sum(a, b);
        assertEquals(result, expectedValue, "Invalid result of sum operation!");
    }

    @DataProvider(name = "longValuesForTest")
    public Object[][] longValuesForSum() {
        return new Object[][] {
            {10, 23, 33},
            {10, -1, 9},
            {0,0,0},
            {-1, 10, 9},
            {-5,-47,-52}
        };
    }

    @DataProvider(name = "doubleValuesForTest")
    public Object[][] doubleValuesForSum() {
        return new Object[][] {
                {10.45, 23.41, 33.86},
                {10.0, -1.45, 8.55},
                {-1.45, 10.45, 9.0},
                {-5.899,-47.2,-53.099}
        };
    }
}

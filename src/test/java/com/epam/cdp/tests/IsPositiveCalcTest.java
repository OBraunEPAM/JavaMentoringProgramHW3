package com.epam.cdp.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class IsPositiveCalcTest extends BaseTest {

    @Test(groups = "basic operations")
    public void isPositiveNumberTest() {
        assertTrue(calculator.isPositive(5));
    }

    @Test(groups = "basic operations")
    public void isPositiveZeroTest() {
        assertFalse(calculator.isPositive(0));
    }

    @Test(groups = "basic operations")
    public void isPositiveTestWithNegativeNumber() {
        assertFalse(calculator.isPositive(-5));
    }
}

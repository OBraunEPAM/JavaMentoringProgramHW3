package com.epam.cdp.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class IsNegativeCalcTest extends BaseTest {

    @Test(groups = "basic operations")
    public void isNegativeNumberTest() {
        assertTrue(calculator.isNegative(-5));
    }

    // this test fails due to lack of null exception handling
    @Test(groups = "basic operations")
    public void isNegativeZeroTest() {
        assertTrue(calculator.isNegative(0));
    }

    @Test(groups = "basic operations")
    public void isNegativeTestWithNegativeNumber() {
        assertFalse(calculator.isNegative(5));
    }
}

package com.epam.cdp.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DivCalcTest extends BaseTest {

    @Test(groups = "basic operations")
    public void positiveLongDivTest() {
        assertEquals(calculator.div(12, 4), 3, "Invalid result of division operation!");
    }

    @Test(groups = "basic operations")
    public void positiveDivTestWithNegativeNumbers() {
        assertEquals(calculator.div(-12, 4), -3, "Invalid result of division operation!");
    }

    @Test(groups = "basic operations")
    public void irrationalNumbersPositiveDivTest() {
        assertEquals(calculator.div(45.248, 2.2624), 20.0, "Invalid result of division operation!");
    }

    @Test(groups = "basic operations")
    public void irrationalNumbersPositiveDivTestWithNegativeNumbers() {
        assertEquals(calculator.div(45.248, -2.2624), -20.0, "Invalid result of division operation!");
    }

    // this test fails due to lack of processing data types in div method
    @Test(groups = "basic operations")
    public void irrationalResultDivTest() {
        assertEquals(calculator.div(12, 24), 0.5, "Invalid result of division operation!");
    }

    // this test fails due to absence of rounding results in div method
    @Test(groups = "basic operations")
    public void irrationalNumbersDivTest() {
        Assert.assertEquals(0.44, calculator.div(0.24, 0.54), 0.01);
    }

    @Test(groups = "basic operations")
    public void divisionByZeroTest() {
        assertThrows(NumberFormatException.class, () -> calculator.div(5,0));
    }

    // this test fails due to absence of division by zero exception handling when double values are present
    @Test(groups = "basic operations")
    public void irrationalNumbersDivisionByZeroTest() {
        assertThrows(NumberFormatException.class, () -> calculator.div(5.5,0.0));
    }
}

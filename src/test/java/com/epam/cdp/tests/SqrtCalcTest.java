package com.epam.cdp.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.NativeNumber.NaN;
import static org.testng.Assert.assertEquals;

public class SqrtCalcTest extends BaseTest {

    @Test
    public void sqrtTest() {
        assertEquals(calculator.sqrt(25), 5.0);
    }

    // this test fails because Calculator.sqrt method takes absolute value of the number
    @Test
    public void sqrtNegativeNumberTest() {
        assertEquals(calculator.sqrt(-25), NaN);
    }

    // this test fails due to absence of rounding results in Calculator.sqrt method
    @Test
    public void sqrtIrrationalNumberTest() {
        Assert.assertEquals(0.34, calculator.sqrt(0.1156), 0.01);
    }
}

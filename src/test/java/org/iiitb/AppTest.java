package org.iiitb;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private App calcTest;

    @Before
    public void setUp() {
        calcTest = new App();
    }

    @Test
    public void testAdd() {
        double a = 15.0;
        double b = 20.0;
        double expectedResult = 35.0;
        double result = calcTest.addition(a, b);
        Assert.assertEquals(expectedResult, result, 0.00);
    }

    @Test
    public void testSubtract() {
        double a = 25.0;
        double b = 20.0;
        double expectedResult = 5.0;
        double result = calcTest.subtraction(a, b);
        Assert.assertEquals(expectedResult, result, 0.00);
    }

    @Test
    public void testMultiply() {
        double a = 10.0;
        double b = 25.0;
        double expectedResult = 250.0;
        double result = calcTest.multiplication(a, b);
        Assert.assertEquals(expectedResult, result, 0.00);
    }

    @Test
    public void testDivide() {
        double a = 56.0;
        double b = 10.0;
        double expectedResult = 5.6;
        double result = calcTest.division(a, b);
        Assert.assertEquals(expectedResult, result, 0.00005);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        double a = 15;
        double b = 0;
        calcTest.division(a, b);
    }

    @Test
    public void testFactorial() {
        double n = 5.0;
        double expectedResult = 120.0;
        double result = calcTest.factorial(n);
        Assert.assertEquals(expectedResult, result, 0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegFact() {
        double n = -5.0;
        calcTest.factorial(n);
    }
}

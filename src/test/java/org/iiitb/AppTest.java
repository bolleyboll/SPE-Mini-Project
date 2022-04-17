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

    @Test
    public void testLogBase10() {
        double n = 5.0;
        double expectedResult = 0.6989700043360189;
        double result = calcTest.logBase10(n);
        Assert.assertEquals(expectedResult, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegLogBase10() {
        double n = -5.0;
        calcTest.logBase10(n);
    }

    @Test
    public void testNatLogA() {
        double a = 5.0;
        double expectedResult = 1.6094379124341003;
        double result = calcTest.natLogA(a);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegNatLogA() {
        double a = 0.0;
        calcTest.natLogA(a);
    }

    @Test
    public void testSqrt() {
        double n = 4.0;
        double expectedResult = 2.0;
        double result = calcTest.sqrt(n);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegSqrt() {
        double n = -3.0;
        calcTest.sqrt(n);
    }

    @Test
    public void testSquared() {
        double n = 4.0;
        double expectedResult = 16.0;
        double result = calcTest.squared(n);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testPowN() {
        double a = 4.0;
        double b = 2.0;
        double expectedResult = 16.0;
        double result = calcTest.pow(a, b);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testSin() {
        double x = 4.0;
        double expectedResult = -0.7568024953079282;
        double result = calcTest.sin(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testCos() {
        double x = 4.0;
        double expectedResult = -0.6536436208636119;
        double result = calcTest.cos(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testTan() {
        double x = 4.0;
        double expectedResult = 1.1578212823495775;
        double result = calcTest.tan(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testSinH() {
        double x = 4.0;
        double expectedResult = 27.28991719712775;
        double result = calcTest.sinh(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testCosH() {
        double x = 4.0;
        double expectedResult = 27.308232836016487;
        double result = calcTest.cosh(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }

    @Test
    public void testTanH() {
        double x = 4.0;
        double expectedResult = 0.999329299739067;
        double result = calcTest.tanh(x);
        Assert.assertEquals(expectedResult, result, 0.0000);
    }
}

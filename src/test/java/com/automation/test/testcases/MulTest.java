package com.automation.test.testcases;


// a = 2, b = 5, expected = 10
// a = 2, b = 0, expected = 0
// a = -1, b = 2, expected = -2
import com.dev.product.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MulTest {
    Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();
    }

    @Test
    public void testPositive(){
        int a = 2, b = 5, excepted = 10;
        int actual = cal.mul(a, b);
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void testZero(){
        int a = 2, b = 0, excepted = 0;
        int actual = cal.mul(a, b);
        Assert.assertEquals(excepted, actual);
    }
    @Test
    public void testNegative(){
        int a = -1, b = 2, excepted = -2;
        int actual = cal.mul(a, b);
        Assert.assertEquals(excepted, actual);
    }

}

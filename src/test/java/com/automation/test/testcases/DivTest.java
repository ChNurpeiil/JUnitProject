package com.automation.test.testcases;


import com.dev.product.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//1. a = 10, b = 5, expected = 2
//2. a = 4, b = 0, expected = exception
//3. a = 10, b = 10, expected = 1
//4. a = -10, b = 5, expected = -2
//5. a = -10, b = -5, expected = -2 , *** <- this test we will make fail
//6. a = 10, b = 20, expected = 0
//7. a = 0, b = 10, expected = 0
//8. a = 0, b = 0, expected = exception
//9. a = 10000, b = 2500, expected = 4
//10. a = 10, b = -5, expected = -2
public class DivTest {
    Calculator cal;

    @Before
    public void setUp() {

        cal = new Calculator();
    }

    @Test
    public void testPositive() {
        int a = 10, b = 5, expected = 2;
        int actual = cal.div(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testWithAnotherZero(){
        int a = 10, b = 0;//TEST DATA
        try{
            cal.div(a,b);
            Assert.fail("Expected exception but it is not throwing exception");
        }catch (Exception e){
//            Assert.assertTrue(true);

            String actualMessage = e.getMessage();
            String expectedMessage = "/ by zero";

            Assert.assertEquals(expectedMessage,actualMessage);//OR
            Assert.assertTrue(expectedMessage.equals(actualMessage));


        }
    }
    @Test
    public void testEqualNumbers() {
        int a = 10, b = 10, expected = 1;
        int actual = cal.div(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testWithFirstNumberIsNegative() {
        int a = -10, b = 5, expected = -2;
        int actual = cal.div(a, b);
        Assert.assertEquals(expected, actual);
    }

}

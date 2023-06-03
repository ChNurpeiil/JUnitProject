package com.automation.test.testcases;

import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before

    public void setUp() {

        System.out.println("Opening browser");
    }
    @After
    public void cleanUp() {

        System.out.println("Close browser");
    }
}

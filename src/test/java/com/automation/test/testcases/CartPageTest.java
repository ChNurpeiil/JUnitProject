package com.automation.test.testcases;


import com.automation.test.categories.RegressionTest;
import com.automation.test.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CartPageTest extends BaseTest {
    @Test
    @Category(SmokeTest.class)
    public void verifyUserCanProductToCart() {

        System.out.println("verify user can add item");
    }

    @Test
    @Category(RegressionTest.class)
    public void verifyUserCanRemoveItemFromCart() {
        System.out.println("verify user can remove item");
    }

    @Test
    @Category(RegressionTest.class)
    public void verifyUserCanChangeQuantityOfItem() {

        System.out.println("verify user can change quantity of item");
    }
}

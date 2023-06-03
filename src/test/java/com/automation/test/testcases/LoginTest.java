package com.automation.test.testcases;

import com.automation.test.categories.RegressionTest;
import com.automation.test.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoginTest extends BaseTest {


    @Test
    @Category(SmokeTest.class)
    public void verifyUserCanLogin(){

        System.out.println("Verify login successful");
    }

    @Test
    @Category(RegressionTest.class)
    public void verifyUserCannotLoginWithInvalidCredentials(){
        System.out.println("Verify login unsuccessful for invalid credentials");
    }
    @Test
    public void verifyUserCanResetPassword(){

        System.out.println("Verify user can reset password");
    }
}

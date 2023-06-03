package com.automation.test.runner;

import com.automation.test.testcases.CartPageTest;
import com.automation.test.testcases.LoginTest;
import com.automation.test.testcases.SearchFunctionalityTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CartPageTest.class,LoginTest.class, SearchFunctionalityTest.class})
public class TestRunner {

}

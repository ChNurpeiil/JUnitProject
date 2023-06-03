package com.automation.test.runner;

import com.automation.test.categories.RegressionTest;
import com.automation.test.categories.SmokeTest;
import com.automation.test.testcases.CartPageTest;
import com.automation.test.testcases.LoginTest;
import com.automation.test.testcases.SearchFunctionalityTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({CartPageTest.class, LoginTest.class, SearchFunctionalityTest.class})
@Categories.IncludeCategory  (SmokeTest.class)
public class GroupRunner {

}

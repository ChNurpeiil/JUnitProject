package com.automation.test.runner;

import homework.OrderCancellationTest;
import homework.PaymentPageTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PaymentPageTest.class, OrderCancellationTest.class})

public class Homework {
}

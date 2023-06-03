package homework;

import com.automation.test.categories.SmokeTest;
import com.automation.test.testcases.BaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PaymentPageTest extends BaseTest {
    @Test
    @Category(SmokeTest.class)
    public void testSuccessPayment(){
        System.out.println("Test successfully payment");
    }
    @Test
    @Category(SmokeTest.class)
    public void testInvalidPayment(){
        System.out.println("Test invalid payment");
    }
    @Test
    @Category(SmokeTest.class)
    public void testWithFind(){
        System.out.println("Test find");
    }
}

package homework;

import com.automation.test.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class OrderCancellationTest {
    @Test
    @Category(SmokeTest.class)
    public void testCancellationOrder(){
        System.out.println("Test Order");
    }
    @Test
    @Category(SmokeTest.class)
    public void testInvalidOrder(){
        System.out.println("Test invalid order");
    }
    @Test
    @Category(SmokeTest.class)
    public void testWithCancellation(){
        System.out.println("Test  with cancellation");
    }
}

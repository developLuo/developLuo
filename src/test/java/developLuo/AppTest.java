package developLuo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAddNumber() {
        System.out.println("App的addNumber方法测试11111111111");
        App app = new App();
        int i = app.addNumber(10, 20);
        Assert.assertEquals(30,i);
    }
    @Test
    public void testAddNumber2() {
        System.out.println("App的addNumber方法测试2222222222");
        App app = new App();
        int i = app.addNumber(50, 20);
        Assert.assertEquals(70,i);
    }
}

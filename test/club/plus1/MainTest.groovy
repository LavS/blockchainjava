package club.plus1

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MainTest extends GroovyTestCase {
    private Main main;

    @Before
    void initTest() {
        main = new Main();
    }

    @After
    void afterTest() {
        main = null;
    }

    @Test
    void testMain() {
        Assert.assertTrue(true);
    }

    @Test(timeout = 500l)
    void timeStampTest() {
        while (true);
    }
}

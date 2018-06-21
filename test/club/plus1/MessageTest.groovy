package club.plus1

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MessageTest extends GroovyTestCase {
    private Message message;

    @Before
    void initTest() {
        message = new Message();
    }

    @After
    void afterTest() {
        message = null;
    }

    @Test
    void testMessage() {
        Assert.assertTrue(true);
    }

    @Test(timeout = 500l)
    void timeStampTest() {
        while (true);
    }
}

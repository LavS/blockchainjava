package club.plus1

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BlockTest extends GroovyTestCase {
    private Block block;

    @Before
    void initTest() {
        block = new Block();
    }

    @After
    void afterTest() {
        block = null;
    }
    @Test
    void testBlock() {
        Assert.assertTrue(true);
    }

    @Test(timeout = 500l)
    void timeStampTest() {
        while (true);
    }
}

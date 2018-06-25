package club.plus1

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BlockchainTest extends GroovyTestCase {
    private Blockchain blockchain;

    @Before
    void initTest() {
        blockchain = new Blockchain();
    }

    @After
    void afterTest() {
        blockchain = null;
    }

    @Test
    void testBlock() {
        Assert.assertTrue(true);
    }

    @Test(timeout = 1000L)
    public void timeStampTest() {
        while (true);
    }

    @Test
    void testNewBlock() {
        Assert.assertTrue(true);
    }

    @Test
    void testNewMessage() {
        Assert.assertTrue(true);
    }

    @Test
    void testHash() {
        Assert.assertTrue(true);
    }

    @Test
    void testLast() {
        Assert.assertTrue(true);
    }
}

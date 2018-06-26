package club.plus1

import static org.junit.Assert.*;
import org.junit.After
import org.junit.Before
import org.junit.Test

class BlockTest {
    private Block block;

    @Before
    void initTest() {
        block = new Block(0, new LinkedList<Message>(), 100, "");
    }

    @After
    void afterTest() {
        block = null;
    }

    @Test
    void test_Block_NotNull() throws Exception {
        assertNotNull(block);
    }

    @Test
    void test_toString_StringNotEmpty() throws Exception {
        String text = block.toString();
        assertTrue(text.size() > 0);
    }

}

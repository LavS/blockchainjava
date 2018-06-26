package club.plus1

import static org.junit.Assert.*;
import org.junit.After
import org.junit.Before
import org.junit.Test

class MessageTest {
    private Message message;

    @Before
    void initTest() {
        message = new Message("Tom", "Jerry", 1, "Я тебя съем");
    }

    @After
    void afterTest() {
        message = null;
    }

    @Test
    void test_Message_NotNull() throws Exception {
        assertNotNull(message);
    }

    @Test
    void test_toString_StringNotEmpty() throws Exception {
        String text = message.toString();
        assertTrue(text.size() > 0);
    }
}

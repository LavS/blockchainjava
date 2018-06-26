package club.plus1

import static org.junit.Assert.*;
import org.junit.Test

class MainTest {
    @Test
    void testMain() throws Exception {
        String[] args = new String[0];
        Main.main(args);
        assertFalse(System.out.checkError());
    }
}

package club.plus1

import static org.junit.Assert.*;
import org.junit.After
import org.junit.Before
import org.junit.Test

class BlockchainTest {

    private Blockchain blockchain;

    @Before
    public void initTest() {
        blockchain = new Blockchain();
    }

    @After
    public void afterTest() {
        blockchain = null;
    }

    @Test
    void test_Blockchain_NotNull() throws Exception {
        assertNotNull(blockchain);
    }

    @Test
    void test_toString_StringNotEmpty() throws Exception {
        String text = blockchain.toString();
        assertTrue(text.size() > 0);
    }

    @Test
    void test_getChain_HasBlocks() throws Exception {
        int size = blockchain.getChain().size();
        assertTrue(size > 0);
    }

    @Test
    void test_getMessages_MessagesNotNull() throws Exception {
        assertNotNull(blockchain.getMessages());
    }

    @Test
    void test_createBlock_ChainSizeIncreased() throws Exception {
        int sizeBefore = blockchain.getChain().size();
        blockchain.createBlock(100, Blockchain.getHash(blockchain.getLastBlock()));
        int sizeAfter = blockchain.getChain().size();
        assertTrue(sizeAfter > sizeBefore);
    }

    @Test
    void test_createMessage_MessageSizeIncreased() throws Exception {
        int sizeBefore = blockchain.getMessages().size();
        blockchain.createMessage("Tom", "Jerry", 1, "Я тебя съем");
        int sizeAfter = blockchain.getMessages().size();
        assertTrue(sizeAfter > sizeBefore);
    }

    @Test
    void test_getHash_HashNotEmpty() throws Exception {
        String hash = Blockchain.getHash(blockchain.getChain()[0]);
        assertTrue(hash.size() > 0);
    }

    @Test
    void test_getLastBlock_EqualLastBlockInChain() throws Exception {
        LinkedList<Block> chain = blockchain.getChain();
        assertEquals(blockchain.getLastBlock(), chain[chain.size() - 1]);
    }
}

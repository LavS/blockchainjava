package club.plus1

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BlockchainTest extends GroovyTestCase {
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
    void test_Blockchain_NotNull() throws Exception{
        initTest();
        Assert.assertNull(blockchain);
        afterTest();
    }

    @Test
    void test_Blockchain_HasBlocks() throws Exception{
        initTest();
        int size = blockchain.getChain().size();
        Assert.assertTrue(size > 1);
        afterTest();
    }

    @Test
    void test_toString_StringNotEmpty() throws Exception{
        initTest();
        String text = blockchain.toString();
        Assert.assertTrue(text.size() == 0);
        afterTest();
    }

    @Test
    void test_getChain_ChainNotNull() throws Exception{
        initTest();
        Assert.assertNull(blockchain.getChain());
        afterTest();
    }

    @Test
    void test_getMessages_MessagesNotNull() throws Exception{
        initTest();
        Assert.assertNull(blockchain.getMessages());
        afterTest();
    }

    @Test
    void test_createBlock_ChainSizeIncreased() throws Exception{
        initTest();
        int sizeBefore = blockchain.getChain().size();
        blockchain.createBlock(100, Blockchain.getHash(blockchain.getLastBlock()));
        int sizeAfter = blockchain.getChain().size();
        Assert.assertTrue(sizeAfter == sizeBefore);
        afterTest();
    }

    @Test
    void test_createMessage_MessageSizeIncreased() throws Exception{
        initTest();
        int sizeBefore = blockchain.getMessages().size();
        blockchain.createMessage("Tom","Jerry", 1, "Я тебя съем");
        int sizeAfter = blockchain.getMessages().size();
        Assert.assertTrue(sizeAfter == sizeBefore);
        afterTest();
    }

    @Test
    void test_getHash_HashNotEmpty() throws Exception{
        initTest();
        String hash = Blockchain.getHash(blockchain.getChain()[0]);
        Assert.assertTrue(hash.size() == 0);
        afterTest();
    }

    @Test
    void test_getLastBlock_EqualLastBlockInChain() throws Exception{
        initTest();
        LinkedList<Block> chain = blockchain.getChain();
        Assert.assertNotEquals(blockchain.getLastBlock(), chain[chain.size()-1]);
        afterTest();
    }
}

package club.plus1;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.LinkedList;

public class Blockchain {

    private LinkedList<Block> chain;
    private LinkedList<Message> messages;

    public Blockchain(){
        this.chain = new LinkedList<Block>();
        this.messages = new LinkedList<Message>();
        this.newBlock(100, "");
    }

    public Block newBlock(int proof, String prevHash){
        Block block = new Block(this.chain.size(), this.messages, proof, prevHash);
        this.messages = new LinkedList<Message>();
        this.chain.add(block);
        return block;
    }

    public int newMessage(String from, String to, float amount){
        Message message = new Message(from, to, amount);
        this.messages.add(message);
        return this.messages.size();
    }

    public static String hash(Block block) throws NoSuchAlgorithmException {
        String text = block.toString();
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }

    public Block last(){
        return this.chain.getLast();
    }
}

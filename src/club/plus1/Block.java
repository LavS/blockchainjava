package club.plus1;

import java.util.Date;
import java.util.LinkedList;

public class Block extends Object{
    public Date timestamp;
    public int index;
    public LinkedList<Message> messages;
    public int proof;
    public String prevHash;

    public Block(int index, LinkedList<Message> messages, int proof, String prevHash){
        this.timestamp = new Date();
        this.index = index;
        this.messages = messages;
        this.proof = proof;
        this.prevHash = prevHash;
    }
}

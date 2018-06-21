package club.plus1;

import java.util.LinkedList;

public class Block {

    private LinkedList<String> chain;
    private LinkedList<String> transaction;

    public Block(){
        this.chain = new LinkedList<String>();
        this.transaction = new LinkedList<String>();
    }

    public LinkedList<String> newBlock(){
        // TODO: Создаём новый блок и добавляем его к цепочке
        return new LinkedList<String>();
    }

    public LinkedList<String> newTransaction(){
        // TODO: Создаём новую транзакцию и добавляем её в список транзакций
        return new LinkedList<String>();
    }

    public static String hash(Block block){
        // TODO: Формируем хеш блока и возвращаем его
        return "";
    }

    public Block last(){
        // TODO: Возвращаем последний блок в цепочке
        return new Block();
    }
}

package club.plus1;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.LinkedList;

/**
 * Класс описывает объекты <b>Blockchain(Цепочка блоков)</b> - которые являются основными объектами проекта.
 * Так же в класе <b>Blockchain</b> используются классы:
 * <b>Block</b> в качестве элемента <b>LinkedList</b> в поле <b>chain</b>;
 * <b>Message</b> в качестве элемента <b>LinkedList</b> в поле <b>messages</b>.
 * Ошибки в классе пока не обрабатываются и не перехватыаются(кроме <b>NoSuchAlgorithmException</b> в методе <b>hash</b>).
 * @author lavsexpert
 * @version 1.0
 */
public class Blockchain {

    private LinkedList<Block> chain;        // Список блоков в цепочке
    private LinkedList<Message> messages;   // Список сообщений(транзакций)

    /**
     * Конструктор объекта <b>Blockchain (Цепочка блоков)</b>
     * Создаёт цепочку с пустыми списками сообщений и блоков. Добавляет корневой блок с доказательством.
     */
    public Blockchain(){
        this.chain = new LinkedList<Block>();
        this.messages = new LinkedList<Message>();
        this.newBlock(100, "");
    }

    /**
     * Создание нового блока в блокчейне с пустым списком сообщений
     * @param proof     доказательство блока (пока не проверяется)
     * @param prevHash  хеш предыдущего блока
     * @return новый объекта класса Block(Блок)
     */
    public Block newBlock(int proof, String prevHash){
        Block block = new Block(this.chain.size(), this.messages, proof, prevHash);
        this.messages = new LinkedList<Message>();
        this.chain.add(block);
        return block;
    }

    /**
     * Создание нового сообщения в текущем блоке
     * @param from      отправитель сообщения
     * @param to        получатель сообщения
     * @param amount    количество
     * @param comment   комментарий
     * @return номер сообщения в блоке
     */
    public int newMessage(String from, String to, float amount, String comment){
        Message message = new Message(from, to, amount, comment);
        this.messages.add(message);
        return this.messages.size();
    }

    /**
     * Поучение хеша блока
     * @param block блок, для которого надо получить кэш
     * @return строка с хешем блока
     * @throws NoSuchAlgorithmException может появиться ошибка при создании хеша
     */
    public static String hash(Block block) throws NoSuchAlgorithmException {
        String text = block.toString();
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }

    /**
     * Получение последнего блока в блокчейне
     * @return последний блок
     */
    public Block last(){
        return this.chain.getLast();
    }
}

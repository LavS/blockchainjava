package club.plus1;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.LinkedList;

/**
 * Класс описывает объекты {@link Blockchain <b>Blockchain(Цепочка блоков)</b>}
 * которые являются основными объектами проекта.
 * Так же в класе {@link Blockchain <b>Blockchain</b>} используются классы:
 * {@link Block <b>Block</b>} в качестве элемента <b>LinkedList</b>
 * в поле {@link Blockchain#chain <b>chain</b>};
 * {@link Message <b>Message</b>} в качестве элемента <b>LinkedList</b>
 * в поле {@link Blockchain#messages <b>messages</b>}.
 * Ошибки в классе пока не обрабатываются и не перехватыаются
 * (кроме <b>NoSuchAlgorithmException</b> в методе {@link Blockchain#getHash <b>getHash</b>}).
 * @author lavsexpert
 * @version 1.0
 */
public class Blockchain extends Object{

    /** Список блоков в цепочке */
    private LinkedList<Block> chain;
    /** Список сообщений(транзакций) */
    private LinkedList<Message> messages;

    /**
     * Конструктор объекта {@link Blockchain <b>Blockchain(Цепочка блоков)</b>}
     * Создаёт цепочку с пустыми списками сообщений и блоков. Добавляет корневой блок с доказательством.
     */
    public Blockchain(){
        super();
        this.chain = new LinkedList<Block>();
        this.messages = new LinkedList<Message>();
        this.createBlock(100, "");
    }

    /**
     * Текст объекта для вывода
     * @return Возвращает текст в формате:
     * <br>Chain:
     * <br>Block[i]
     * <br>{@link Blockchain#chain}</b>
     * <br>Messages:
     * <br>Message[i]
     * <br>{@link Blockchain#messages}</b>
     */
    @Override
    public String toString(){
        String text = "Chain:\n";
        int i = 0;
        for (Block block: this.chain) {
            i++;
            text += "Block[" + i + "]\n" + block.toString() + "\n";
        }
        i = 0;
        text += "Messages:\n";
        for (Message message: this.messages) {
            i++;
            text += "Message[" + i + "]\n" + message.toString() + "\n";
        }
        return text;
    }

    /**
     * Получение списка блоков
     * @return Список блоков
     */
    public LinkedList<Block> getChain(){
        return this.chain;
    }

    /**
     * Получение списка сообщений
     * @return Список сообщений
     */
    public LinkedList<Message> getMessages(){
        return this.messages;
    }

    /**
     * Создание нового блока в блокчейне с пустым списком сообщений
     * @param proof     доказательство блока (пока не проверяется)
     * @param prevHash  хеш предыдущего блока
     * @return новый объекта класса {@link Block Block(Блок)}
     */
    public Block createBlock(int proof, String prevHash){
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
    public int createMessage(String from, String to, float amount, String comment){
        Message message = new Message(from, to, amount, comment);
        this.messages.add(message);
        return this.messages.size();
    }

    /**
     * Поучение хеша блока
     * @param block блок, для которого надо получить кэш
     * @return строка с хешем блока
     * @throws NoSuchAlgorithmException может появиться ошибка
     */
    public static String getHash(Block block) throws NoSuchAlgorithmException {
        String text = block.toString();
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }

    /**
     * Получение последнего блока в блокчейне
     * @return последний блок
     */
    public Block getLastBlock(){
        return this.chain.getLast();
    }

}

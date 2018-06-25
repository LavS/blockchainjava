package club.plus1;

import java.util.Date;
import java.util.LinkedList;

/**
 * Класс описывает объект <b>Block(Блок)</b>, который входит в качестве элемента <b>LinkedList</b>
 * в поле <b>chain</b> в классе <b>Blockchain</b>. Так же в класе <b>Block</b> используется класс <b>Message</b>
 * в качестве элемента LinkedList в поле <b>messages</b>.
 * Пока в классе все поля публичны, что не безопасно.
 * Ошибки в классе пока не обрабатываются и не перехватыаются.
 * @author lavsexpert
 * @version 1.0
 */
public class Block {
    public Date timestamp;              // Отметка времени
    public int index;                   // Код(индекс) блока
    public LinkedList<Message> messages;// Список сообщений(транзакций)
    public int proof;                   // Доказательство
    public String prevHash;             // Хеш предыдущего блока

    /**
     * Конструктор объекта <b>Block(Блок)</b> в блокчейне
     * @param index     код(индекс) блока
     * @param messages  список сообщений(транзакций)
     * @param proof     доказательство
     * @param prevHash  хеш предыдущего блока
     */
    public Block(int index, LinkedList<Message> messages, int proof, String prevHash){
        this.timestamp = new Date();
        this.index = index;
        this.messages = messages;
        this.proof = proof;
        this.prevHash = prevHash;
    }
}

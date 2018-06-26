package club.plus1;

import java.util.Date;
import java.util.LinkedList;

/**
 * Класс описывает объект {@link Block <b>Block(Блок)</b>},
 * который входит в качестве элемента <b>LinkedList</b> в поле {@link Blockchain#chain <b>chain</b>}
 * в классе {@link Blockchain <b>Blockchain</b>}.
 * Так же в класе {@link Block <b>Block</b>} используется класс {@link Message <b>Message</b>}
 * в качестве элемента LinkedList в поле {@link Block#messages <b>messages</b>}.
 * Пока в классе все поля публичны, что не безопасно.
 * Ошибки в классе пока не обрабатываются и не перехватыаются.
 * @author lavsexpert
 * @version 1.0
 */
public class Block extends Object{
    /** Отметка времени */
    public Date timestamp;
    /** Код(индекс) блока */
    public int index;
    /** Список сообщений(транзакций) */
    public LinkedList<Message> messages;
    /** Доказательство */
    public int proof;
    /** Хеш предыдущего блока */
    public String prevHash;

    /**
     * Конструктор объекта {@link Block <b>Block(Блок)</b>} в блокчейне
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

    /**
     * Текст объекта для вывода
     * @return Возвращает текст в формате:
     * <b><br>Index: {@link Block#index}
     * <br>Proof: {@link Block#proof}
     * <br>Previous hash: {@link Block#prevHash}
     * <br>Time stamp{@link Block#timestamp}
     * <br>Messages:
     * <br>Message[i]
     * <br>{@link Block#messages}</b>
     */
    @Override
    public String toString(){
        String text = "Index: " + this.index + "\n"
                + "Proof: " + this.proof + "\n"
                + "Previous hash: " + this.prevHash + "\n"
                + "Time stamp: " + this.timestamp + "\n"
                + "Messages:\n";
        int i = 0;
        for (Message message: this.messages) {
            i++;
            text += "Message["+ i + "]\n"
                   + message.toString() + "\n";
        }
        return text;
    }
}

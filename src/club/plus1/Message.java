package club.plus1;

/**
 * Класс описывает объект {@link Message <b>Message(Сообщение)</b>},
 * который входит в качестве элемента <b>LinkedList</b> в поле <b>messages</b>
 * в классах {@link Block <b>Block</b>} и {@link Blockchain <b>Blockchain</b>}.
 * Ошибки в классе пока не обрабатываются и не перехватыаются.
 *
 * @author lavsexpert
 * @version 1.0
 */
public class Message extends Object {
    /** Адрес отправителя */
    private String from;
    /** Адрес получателя */
    private String to;
    /** Количество */
    private float amount;
    /** Текст сообщения */
    private String text;

    /**
     * Конструктор объекта {@link Message <b>Message(Сообщение)</b>} в блокчейне
     *
     * @param from   адрес отправителя
     * @param to     адрес получателя
     * @param amount количество
     * @param text   текст сообщения
     */
    public Message(String from, String to, float amount, String text) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.text = text;
    }

    /**
     * Текст объекта для вывода
     *
     * @return Возвращает текст в формате:
     * <b><br>From: {@link Message#from}
     * <br>To: {@link Message#to}
     * <br>Amount: {@link Message#amount}
     * <br>{@link Message#text}</b>
     */
    @Override
    public String toString() {
        return "From: " + this.from + "\n"
                + "To: " + this.to + "\n"
                + "Amount: " + this.amount + "\n"
                + this.text;
    }
}

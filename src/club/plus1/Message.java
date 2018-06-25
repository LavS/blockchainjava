package club.plus1;

/**
 * Класс описывает объект <b>Message(Сообщение)</b>, который входит в качестве элемента <b>LinkedList</b>
 * в поле <b>messages</b> в классах <b>Block</b> и <b>Blockchain</b>.
 * Пока в классе все поля публичны, что не безопасно.
 * Ошибки в классе пока не обрабатываются и не перехватыаются.
 * @author lavsexpert
 * @version 1.0
 */
public class Message {
    public String from;     // Адрес отправителя
    public String to;       // Адрес получателя
    public float amount;    // Количество
    public String comment;  // Комментарий

    /**
     * Конструктор объекта <b>Message(Сообщение|транзакция)</b> в блокчейне
     * @param from      адрес отправителя
     * @param to        адрес получателя
     * @param amount    количество
     * @param comment   комментарий
     */
    public Message(String from, String to, float amount, String comment){
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.comment = comment;
    }
}

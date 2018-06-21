package club.plus1;

public class Message {
    public String from;     // Адрес отправителя
    public String to;       // Адрес получателя
    public float amount;    // Количество

    public Message(String from, String to, float amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
}

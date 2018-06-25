package club.plus1;

/**
 * Основной класс программы, через который идёт взаимодействие с другими классами и консолью
 * @author lavsexpert
 * @version 1.0
 */
public class Main {

    /**
     * Главная функция программы. Создаёт объект <b>блокчейн(Blockchain)</b>
     * @param args параметры командной строки
     */
    public static void main(String[] args) {
        System.out.println("Hello, blockchain!");
        Blockchain block = new Blockchain();
    }
}

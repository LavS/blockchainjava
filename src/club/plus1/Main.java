package club.plus1;

import java.security.NoSuchAlgorithmException;

/**
 * Основной класс программы, через который идёт взаимодействие с другими классами и консолью
 * @author lavsexpert
 * @version 1.0
 */
public class Main extends Object{

    /**
     * Главная функция программы. Создаёт объект {@link Blockchain <b>Blockchain(Цепочка блоков)</b>}
     * @param args параметры командной строки
     * @throws NoSuchAlgorithmException пока это исключение не отлавливается.
     * Оно прилетает из метода {@link Blockchain#getHash <b>getHash()</b>} объекта {@link Blockchain <b>Blockchain(Цепочка блоков)</b>}
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Blockchain blockchain = new Blockchain();
        System.out.println("Hello, blockchain!");
    }
}

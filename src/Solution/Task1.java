// 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package Solution;

import java.util.LinkedList;

public class Task1 {
    // Сначала создаю строки, затем LinkedList и заполняю его данными, потом вызываю
    // методы, описанные ниже
    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);

        System.out.println("Лист: " + earlBio);
        System.out.println("Первый элемент в очереди (не удаленный): " + first(earlBio));
        System.out.println("Лист после выполнения операции: " + earlBio);
        System.out.println("Первый элемент в очереди dequene (на удаление): " + dequene(earlBio));
        System.out.println("Лист после удаления: " + earlBio);
        System.out.println("Добавляю элемент в конец очереди: " + enquene(earlBio));
        System.out.println("Лист после добавления элемента: " + earlBio);

    }

    private static String first(LinkedList<String> earlBio) {

        return earlBio.getFirst();

    }

    private static String dequene(LinkedList<String> earlBio) {
        earlBio.getFirst();

        return earlBio.removeFirst();

    }

    private static String enquene(LinkedList<String> earlBio) {

        String str1 = new String("item");

        earlBio.addLast("item");

        return str1;

    }

}
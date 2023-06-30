// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Solution;

import java.util.Collections;
import java.util.LinkedList;

public class Task0 {
//  Создаю лист, заполняю данными, распечатываю, переворачиваю в методе reverseLinkedList,
//  вызываю метод и распечатываю перевернутый.
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("Лист до разворота  " + list); // [a, b, c]
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println("Лист после разворота  " + reversedList); // [c, b, a]
    }
 
    public static LinkedList <String>  reverseLinkedList(LinkedList  <String>list) {
        Collections.reverse(list);
        return list;
    }
}

package homework.ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    /*Вывод на экран элементов List:
    Создать список, заполнить его на 10 элементов
    и вывести на экран содержимое используя iterator*/

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherries");
        fruits.add("figs");
        fruits.add("kiwifruit");
        fruits.add("lemon");
        fruits.add("mandarin");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("pear");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String tmp = iterator.next();
            System.out.println(tmp);
        }
    }

}

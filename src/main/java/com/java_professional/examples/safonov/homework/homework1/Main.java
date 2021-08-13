package com.java_professional.examples.safonov.homework.homework1;
/*
Задание 2
Вывод на экран элементов List: Создать список, заполнить
его на 10 элементов и вывести на экран содержимое используя iterator
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Animal("Кеша", 4, 8));
        }

        for (Animal animal : list) {
            System.out.println(animal);
        }
        //       System.out.println("---------------------------");

        //      Collections.sort(list, new Comparator<Animal>() {
        //         @Override
        //         public int compare(Animal o1, Animal o2) {
        //               return o1.age - o2.age;
        //           }
        //      });
        //      System.out.print(list);

    }
}

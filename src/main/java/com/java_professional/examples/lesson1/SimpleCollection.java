package com.java_professional.examples.lesson1;

import java.util.ArrayList;
import java.util.List;

public class SimpleCollection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.add(1));
        System.out.println(list1.size());
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list2.size());
        list2.addAll(list1);
        System.out.println(list2 + " " + list2.size());

        list2.clear();
        System.out.println(list2 + " " + list2.size());
        System.out.println(list2.isEmpty());
        Object[] arr = list2.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);

    }
}

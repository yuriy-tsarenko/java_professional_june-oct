package com.java_professional.examples.lesson1.javaProfessional.ex_006;


import java.util.Comparator;

public class SimpleComparatorStudent implements Comparator<SimpleComparableStudent> {
    @Override
    public int compare(SimpleComparableStudent o1, SimpleComparableStudent o2) {
        String firstName1 = o1.getFirstName();
        String firstName2 = o2.getFirstName();
        return firstName1.compareTo(firstName2);
    }
}

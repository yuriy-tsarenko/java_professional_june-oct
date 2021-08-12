package com.java_professional.examples.lesson1.javaProfessional.ex_006;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {new SimpleComparableStudent("Yevhenii", 333),
                new SimpleComparableStudent("Andrew", 222),
                new SimpleComparableStudent("Igor", 111),
                new SimpleComparableStudent("Peter", 300),
        };
        Arrays.sort(myStudents, new SimpleComparatorStudent());

        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}

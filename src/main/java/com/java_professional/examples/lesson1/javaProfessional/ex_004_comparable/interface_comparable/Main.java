package com.java_professional.examples.lesson1.javaProfessional.ex_004_comparable.interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 17, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);

        Animal[] animals = {cat, dog, bird};

        Arrays.sort(animals);   // ClassCastException w/o Comparable

        for (Animal tmp : animals) {
            System.out.println(tmp);
        }
    }
}

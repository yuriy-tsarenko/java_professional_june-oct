package com.java_professional.examples.lesson1.javaProfessional.ex_003_sorting.sorting_objects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);

        Animal[] animals = {cat, dog, bird};

        System.out.println(Arrays.toString(animals));

        Arrays.sort(animals);   // ClassCastException

        System.out.println(Arrays.toString(animals));
    }
}

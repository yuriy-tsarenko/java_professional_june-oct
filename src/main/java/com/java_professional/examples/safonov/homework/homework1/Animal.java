package com.java_professional.examples.safonov.homework.homework1;


public class Animal {
    String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal {"
                + "name= '" + name + '\''
                + ", age= " + age
                + ", weight= " + weight
                + '}';
    }
}
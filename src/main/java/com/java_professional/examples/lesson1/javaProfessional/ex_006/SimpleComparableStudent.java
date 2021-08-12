package com.java_professional.examples.lesson1.javaProfessional.ex_006;

public class SimpleComparableStudent implements Comparable<SimpleComparableStudent> {
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    @Override
    public int compareTo(SimpleComparableStudent student) {
        if (this.group > student.group) {
            return 1;
        } else if (this.group < student.group) {
            return -1;
        } else {
            return 0;
        }
    }

//    @Override
//    public int compareTo(Object o) {
//        if (this.group > ((SimpleComparableStudent)o).group) {
//            return 1;
//        } else if (this.group < ((SimpleComparableStudent)o).group) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}

package com.topics.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Comparable interface is used to order the objects of user-defined class.
 * This interface is found in java.lang package and contains only one method named compareTo(Object).
 * It provide only single sorting sequence i.e. you can sort the elements on based on single data member only.
 */
public class ComparableExample {

    private ComparableExample() {
        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student(2, "Mukesh", 27));
        arrayList.add(new Student(1, "Kusum", 29));
        arrayList.add(new Student(3, "Prateek", 22));

        Collections.sort(arrayList);
        for (Student student : arrayList) {
            System.out.println(student.getRollNo() + " || " + student.getName() + " || " + student.getAge());
        }
    }

    public static void main(String[] args) {
        new ComparableExample();
    }
}

package com.topics.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * If we want to sort java object array or list, we need to implement java
 * Comparable interface to provide default sorting
 * and we should implement java
 * Comparator interface to provide different ways of sorting.
 *
 * Comparable vs Comparator
 * Comparable interface can be used to provide single way of sorting whereas Comparator interface is used to provide different ways of sorting.
 * For using Comparable, Class needs to implement it whereas for using Comparator we don’t need to make any change in the class.
 * Comparable interface is in java.lang package whereas Comparator interface is present in java.util package.
 * We don’t need to make any code changes at client side for using Comparable, Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class.
 * For Comparator, client needs to provide the Comparator class to use in compare() method.
 */
class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        System.out.println("Sorting by Name...");
        al.sort(new NameComparator());
        for (Student st : al) {
            System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
        }

        System.out.println("Sorting by Age...");
        al.sort(new AgeComparator());
        for (Student st : al) {
            System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
        }

        Collections.sort(al);
        for (Student student : al) {
            System.out.println(student.getRollNo() + " || " + student.getName() + " || " + student.getAge());
        }
    }
}

/**
 * Comparable interface imposes a total ordering on the objects of each class that
 * implements it.
 * <p>
 * Comparable interface has only one method and that is compareTo().
 */
class Student implements Comparable<Student> {

    private int rollNo;
    private String name;
    private int age;

    Student(int rollNo, String name, int age) {
        this.setRollNo(rollNo);
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getRollNo() {
        return rollNo;
    }

    private void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(rollNo, student.getRollNo());
    }
}

/**
 * Age comparator
 */
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

/**
 * Name comparator
 */
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

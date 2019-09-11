package com.topics.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * If we want to sort object array or list, we need to implement Comparable interface to provide default sorting or NATURAL SORTING
 *
 * Comparable vs Comparator
 * Comparable interface can be used to provide single way of sorting(NATURAL SORTING) whereas Comparator interface is used to provide different ways of sorting.
 * For using Comparable, Class needs to implement it whereas for using Comparator we don’t need to make any change in the class.
 * Comparable interface is in java.lang package whereas Comparator interface is present in java.util package.
 * We don’t need to make any code changes at client side for using Comparable, Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class.
 * For Comparator, client needs to provide the Comparator class to use in compare() method.
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

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Student student) {
        return Integer.compare(rollNo, student.getRollNo());
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNo() == student.getRollNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNo());
    }
}

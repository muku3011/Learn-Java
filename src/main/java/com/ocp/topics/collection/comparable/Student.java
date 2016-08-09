package com.ocp.topics.collection.comparable;

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
        if (rollNo < student.getRollNo())
            return -1;
        else if (rollNo > student.getRollNo())
            return 1;
        else
            return 0;
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
}
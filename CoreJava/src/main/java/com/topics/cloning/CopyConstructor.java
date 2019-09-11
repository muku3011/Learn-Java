package com.topics.cloning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Copying Objects in Java using Copy constructor
 */
public class CopyConstructor {

    public static void main(String[] args) {
        Student student = new Student("Jon Snow", 22, new HashSet<>(Arrays.asList("Maths", "Science", "English")));

        // calling copy constructor
        Student stu = new Student(student);
        System.out.println("Using Copy Constructor : " + stu.toString());

        // any change made to stu's map will not reflect in student's map
        stu.getSubjects().add("History");
        System.out.println(student.getSubjects());
    }
}

class Student {

    private String name;
    private int age;
    private Set<String> subjects;

    public Student(String name, int age, Set<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    // Copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;

        // Shallow copy
        // this.subjects = student.subjects;

        // Deep copy - create new instance of HashSet
        this.subjects = new HashSet<>(student.subjects);
    }

    @Override
    public String toString() {
        return Arrays.asList(name, String.valueOf(age),
                subjects.toString()).toString();
    }

    public Set<String> getSubjects() {
        return subjects;
    }
}

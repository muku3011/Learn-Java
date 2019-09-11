package com.topics.cloning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CopyFactory {

    public static void main(String[] args) {
        Students student = new Students("Jon Snow", 22, new HashSet<>(Arrays.asList("Maths", "Science", "English")));

        // using copy Factory
        Students stu = Students.newInstance(student);
        System.out.println("Using Copy Factory : " + stu.toString());

        // any change made to stu's map will not reflect in student's map
        stu.getSubjects().add("History");
        System.out.println(student.getSubjects());
    }
}

class Students {

    private String name;
    private int age;
    private Set<String> subjects;

    public Students(String name, int age, Set<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    // Copy constructor
    public Students(Students student) {
        this.name = student.name;
        this.age = student.age;
        this.subjects = new HashSet<>(student.subjects);    // deep copy
    }

    // Copy factory
    public static Students newInstance(Students student) {
        return new Students(student);
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

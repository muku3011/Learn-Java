package com.topics.collection.comparator;

/**
 * Comparable interface imposes a total ordering on the objects of each class that
 * implements it.
 * 
 * Comparable interface has only one method and that is compareTo().
 */
class Student {
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
}
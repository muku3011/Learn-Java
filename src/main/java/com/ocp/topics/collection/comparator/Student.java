package com.ocp.topics.collection.comparator;

/**
 * Comparable interface imposes a total ordering on the objects of each class that
 * implements it.
 * 
 * Comparable interface has only one method and that is compareTo().
 */
class Student {
	private int rollno;
	private String name;
	private int age;

	public Student(int rollno, String name, int age) {
		this.setRollno(rollno);
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
package com.ocp.topics.collection.comparable;

/**
 * Comparable interface imposes a total ordering on the objects of each class that
 * implements it.
 * 
 * Comparable interface has only one method and that is compareTo().
 */
class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private int age;

	public Student(int rollno, String name, int age) {
		this.setRollno(rollno);
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
		if (rollno == student.getRollno())
			return 0;
		else if (rollno > student.getRollno())
			return 1;
		else
			return -1;
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
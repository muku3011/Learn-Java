package com.ocp.topics.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *Comparable interface is used to order the objects of user-defined class.
 *This interface is found in java.lang package and contains only one method named compareTo(Object).
 *It provide only single sorting sequence i.e. you can sort the elements on based on single data member only.
 */
class ComparatorExample
{
	public static void main(String args[]) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name...");

		Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}

		System.out.println("Sorting by Age...");

		Collections.sort(al, new AgeComparator());
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}

	}
}

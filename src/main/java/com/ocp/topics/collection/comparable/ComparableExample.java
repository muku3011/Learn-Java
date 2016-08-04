package com.ocp.topics.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *Comparable interface is used to order the objects of user-defined class.
 *This interface is found in java.lang package and contains only one method named compareTo(Object).
 *It provide only single sorting sequence i.e. you can sort the elements on based on single data member only.
 */
public class ComparableExample 
{
	private ArrayList<Student> arrayList=new ArrayList<Student>();  
	
	public ComparableExample() {  
		arrayList.add(new Student(2,"Mukesh",27));  
		arrayList.add(new Student(1,"Kusum",29));  
		arrayList.add(new Student(3,"Prateek",22));  
		  
		Collections.sort(arrayList);  
		Iterator<Student> itrerator = arrayList.iterator();  
		
		while(itrerator.hasNext()){  
			Student student = itrerator.next();  
			System.out.println(student.getRollno()+" || "+student.getName()+" || "+student.getAge());  
		}
	}
	
	public static void main(String args[]) {
		new ComparableExample();
	}
}

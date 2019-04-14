package com.topics.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/*
1) ArrayList is not synchronized.	
		Vector is synchronized.

2) ArrayList increments 50% of current array size if number of element exceeds from its capacity.	
		Vector increments 100% means doubles the array size if total number of element exceeds than its capacity.

3) ArrayList is not a legacy class, it is introduced in JDK 1.2.	
		Vector is a legacy class.

4) ArrayList is fast because it is non-synchronized.	
		Vector is slow because it is synchronized i.e. in multithreading environment,it will hold the other 
		threads in runnable or non-runnable state until current thread releases the lock of object.

5) ArrayList uses Iterator interface to traverse the elements.	
		Vector uses Enumeration interface to traverse the elements. 
		But it can use Iterator also.to handle the problem at compile time than runtime.
*/

/**
 * Vector implements a dynamic array. It is similar to ArrayList, but with two differences:
 * 1. Vector is synchronized.
 * 2. Vector contains many legacy methods that are not part of the collections framework.
 */
public class VectorExample {

	private Vector<String> vectorExample = new Vector<String>();

	public VectorExample () {
		vectorExample.add("Mukesh");
		vectorExample.add("Kusum");
		vectorExample.add("Prateek");
		
		System.out.println("Size : " +vectorExample.size());
		System.out.println("Empty : " +vectorExample.isEmpty());
		System.out.println("Hash Code : " +vectorExample.hashCode());
		
		for (String stringValue : vectorExample) {
			System.out.println(stringValue);
		}
		
		Iterator<String> iterator=vectorExample.iterator();  
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<String> itr = vectorExample.listIterator();
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		Enumeration<String> enumeration=vectorExample.elements();  
		  while(enumeration.hasMoreElements()){  
		   System.out.println(enumeration.nextElement());  
		  }  
	}
	
	public static void main(String args[]) {
		new VectorExample();
	}
}

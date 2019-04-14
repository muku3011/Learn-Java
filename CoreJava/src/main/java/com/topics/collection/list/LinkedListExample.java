package com.topics.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Java LinkedList class uses doubly linked list to store the elements. 
 * It extends the AbstractList class and implements List and Deque interfaces.
 * Java LinkedList class can contain duplicate elements.
 * Java LinkedList class maintains insertion order.
 * Java LinkedList class is non synchronized.
 * In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
 * Java LinkedList class can be used as list, stack or queue.
 */
public class LinkedListExample {

	private List<String> linkedListExample = new LinkedList<String>();

	public LinkedListExample () {
		linkedListExample.add("Mukesh");
		linkedListExample.add("Kusum");
		linkedListExample.add("Prateek");
		
		System.out.println("Size : " +linkedListExample.size());
		System.out.println("Empty : " +linkedListExample.isEmpty());
		System.out.println("Hash Code : " +linkedListExample.hashCode());
		
		for (String stringValue : linkedListExample) {
			System.out.println(stringValue);
		}
		
		Iterator<String> iterator=linkedListExample.iterator();  
		  while(iterator.hasNext()){  
			  System.out.println(iterator.next());  
		  }
		ListIterator<String> itr = linkedListExample.listIterator();
		System.out.println(itr.hasPrevious());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		  
		  
	}
	
	public static void main(String args[]) {
		new LinkedListExample();
	}
}

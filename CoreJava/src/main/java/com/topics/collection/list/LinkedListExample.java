package com.topics.collection.list;

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
 *
 * addFirst		O(1)	Insert element to the beginning of the list.
 * addLast		O(1)	Insert element to the end of the list.
 * removeFirst	O(1)	Remove element to the beginning of the list.
 * removeLast	O(1)	Remove element to the end of the list.
 * add			O(n)	Insert element anywhere in the list.
 * remove		O(n)	Remove any element from the list
 * contains		O(n)	Search for any element from the list
 */
public class LinkedListExample {

	private LinkedListExample() {
		List<String> linkedListExample = new LinkedList<>();

		linkedListExample.add("Mukesh");
		linkedListExample.add("Kusum");
		linkedListExample.add("Prateek");
		
		System.out.println("Size : " + linkedListExample.size());
		System.out.println("Empty : " + linkedListExample.isEmpty());
		System.out.println("Hash Code : " + linkedListExample.hashCode());
		
		for (String stringValue : linkedListExample) {
			System.out.println(stringValue);
		}

		for (String s : linkedListExample) {
			System.out.println(s);
		}
		ListIterator<String> itr = linkedListExample.listIterator();
		System.out.println(itr.hasPrevious());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
	
	public static void main(String[] args) {
		new LinkedListExample();
	}
}

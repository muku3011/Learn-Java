package com.topics.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/**
 * Stack is a subclass of Vector that implements a standard last-in, first-out stack.
 * 
 * Stack only defines the default constructor, which creates an empty stack. 
 * Stack includes all the methods defined by Vector, and adds several of its own.
 * 
 *Object peek()
 *Returns the element on the top of the stack, but does not remove it. 
 *
 *Object pop()
 *Returns the element on the top of the stack, removing it in the process.
 *
 *Object push(Object element)
 *Pushes element onto the stack. element is also returned.
 */
public class StackExample {

	private Stack<String> stackExample = new Stack<String>();

	public StackExample () {
		stackExample.push("Mukesh");
		stackExample.push("Kusum");
		stackExample.push("Prateek");
		
		System.out.println("Size : " +stackExample.size());
		System.out.println("Empty : " +stackExample.isEmpty());
		System.out.println("Hash Code : " +stackExample.hashCode());
		System.out.println("Peek Element : " +stackExample.peek());
		System.out.println("Pop Element (Remove) : " +stackExample.pop());
		
		for (String stringValue : stackExample) {
			System.out.println(stringValue);
		}
		
		Iterator<String> iterator=stackExample.iterator();  
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<String> itr = stackExample.listIterator();
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		
	}
	
	public static void main(String[] args) {
		new StackExample();
	}
}

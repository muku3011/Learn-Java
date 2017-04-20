package com.topics.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * The Queue interface basically orders the element in FIFO(First In First Out)manner.
 *
 ** PriorityQueue class: **
 *
 *The PriorityQueue class provides the facility of using queue. But it does not orders the elements in FIFO manner.
 */
public class PriorityQueueExample
{
	private PriorityQueue<String> priorityQueue=new PriorityQueue<String>();  
	public PriorityQueueExample() 
	{
		priorityQueue.add("Amit");  
		priorityQueue.add("Vijay");  
		priorityQueue.add("Karan");  
		priorityQueue.add("Jai");  
		priorityQueue.add("Rahul");  
		  
		System.out.println("head:"+priorityQueue.element());  
		System.out.println("head:"+priorityQueue.peek());  
		  
		Iterator<String> itr=priorityQueue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		  
		priorityQueue.remove();  
		priorityQueue.poll();  
		  
		Iterator<String> iterator = priorityQueue.iterator();  
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());  
		}  
	}
	
	public static void main(String args[]){
		new PriorityQueueExample();
	}  
}

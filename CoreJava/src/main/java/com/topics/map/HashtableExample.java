package com.topics.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

/**
 * A Hashtable is an array of list.Each list is known as a bucket.
 * 
 * The position of bucket is identified by calling the hashcode() method.
 * A Hashtable contains values based on the key. It implements the Map interface and extends Dictionary class.
 * 
 * It contains only unique elements.
 * It may have not have any null key or value.
 * It is synchronized.
 * 
 * Difference between HashMap and Hashtable
 */
public class HashtableExample 
{
	private Hashtable<Integer,String> hashTable=new Hashtable<Integer,String>();  
	
	public HashtableExample() {
		hashTable.put(0, "Mukesh");
		hashTable.put(1, "Kusum");
		hashTable.put(2, "Prateek");
		hashTable.put(3, "Deepak");
		hashTable.put(4, "Sunita");
		hashTable.put(0, "Test"); // this will override the old value @ {0}
		
		for (Entry<Integer, String> entry : hashTable.entrySet()) {
			System.out.println("Key : "+entry.getKey() +" Value : "+entry.getValue());
		}
		
		Enumeration<String> enumerator=hashTable.elements();  
		  while(enumerator.hasMoreElements()){  
		   System.out.println(enumerator.nextElement());  
		  }  
	}
	
	public static void main(String args[]) {
		new HashtableExample();
	}



}

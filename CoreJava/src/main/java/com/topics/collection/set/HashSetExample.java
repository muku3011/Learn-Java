package com.topics.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * List can contain duplicate elements whereas Set contains unique elements only.
 * 
 * Uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
 * 
 * Contains unique elements only.
 */
public class HashSetExample {

	private Set<String> hashSetExample = new HashSet<String>();

	public HashSetExample () {
		hashSetExample.add("Mukesh");
		hashSetExample.add("Kusum");
		hashSetExample.add("Prateek");
		hashSetExample.add("Prateek");
		
		System.out.println("Size : " +hashSetExample.size());
		System.out.println("Empty : " +hashSetExample.isEmpty());
		System.out.println("Hash Code : " +hashSetExample.hashCode());
		
		for (String stringValue : hashSetExample) {
			System.out.println(stringValue);
		}
		
		Iterator<String> iterator=hashSetExample.iterator();  
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String args[]) {
		new HashSetExample();
	}
}

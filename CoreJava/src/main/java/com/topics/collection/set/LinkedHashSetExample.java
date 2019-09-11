package com.topics.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
 * Maintains insertion order.
 */
public class LinkedHashSetExample {

	private LinkedHashSetExample() {
		Set<Integer> linkedHashSetExample = new LinkedHashSet<>();
		linkedHashSetExample.add(3);
		linkedHashSetExample.add(1);
		linkedHashSetExample.add(0);
		linkedHashSetExample.add(2);
		
		System.out.println("Size : " + linkedHashSetExample.size());
		System.out.println("Empty : " + linkedHashSetExample.isEmpty());
		System.out.println("Hash Code : " + linkedHashSetExample.hashCode());
		
		for (Integer intValue : linkedHashSetExample) {
			System.out.println(intValue);
		}

		for (Integer integer : linkedHashSetExample) {
			System.out.println(integer);
		}
	}
	
	public static void main(String[] args) {
		new LinkedHashSetExample();
	}
}

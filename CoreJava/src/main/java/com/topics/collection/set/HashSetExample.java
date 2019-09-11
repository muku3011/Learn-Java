package com.topics.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains unique elements only.
 *
 * Access/Search (Set.has)	O(n)	O(1)	O(n) is an extreme case when there are too many collisions
 * Insert/Edit (Set.add)	O(n)	O(1)	O(n) only happens with rehash when the Hash is 0.75 full
 * Delete (Set.delete)		O(n)	O(1)	O(n) is an extreme case when there are too many collisions
 */
public class HashSetExample {

	private HashSetExample() {
		Set<String> hashSetExample = new HashSet<>();
		hashSetExample.add("Mukesh");
		hashSetExample.add("Kusum");
		hashSetExample.add("Prateek");
		hashSetExample.add("Prateek");
		
		System.out.println("Size : " + hashSetExample.size());
		System.out.println("Empty : " + hashSetExample.isEmpty());
		System.out.println("Hash Code : " + hashSetExample.hashCode());
		
		for (String stringValue : hashSetExample) {
			System.out.println(stringValue);
		}

		for (String s : hashSetExample) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		new HashSetExample();
	}
}

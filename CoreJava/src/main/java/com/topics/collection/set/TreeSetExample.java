package com.topics.collection.set;

import java.util.TreeSet;

/**
 * Contains unique elements only like HashSet.
 * The TreeSet class implements NavigableSet interface that extends the SortedSet interface.
 * 
 * Maintains ascending order.
 */
public class TreeSetExample {

	private TreeSetExample() {
		TreeSet<Integer> treeSetExample = new TreeSet<>();
		treeSetExample.add(3);
		treeSetExample.add(1);
		treeSetExample.add(0);
		treeSetExample.add(2);
		
		System.out.println("Size : " + treeSetExample.size());
		System.out.println("Empty : " + treeSetExample.isEmpty());
		System.out.println("Hash Code : " + treeSetExample.hashCode());
		
		for (Integer intValue : treeSetExample) {
			System.out.println(intValue);
		}

		for (Integer integer : treeSetExample) {
			System.out.println(integer);
		}
	}
	
	public static void main(String[] args) {
		new TreeSetExample();
	}
}

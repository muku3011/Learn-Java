package com.topics.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Contains unique elements only like HashSet.
 * The TreeSet class implements NavigableSet interface that extends the SortedSet interface.
 * 
 * Maintains ascending order.
 */
public class TreeSetExample {

	private TreeSet<Integer> treeSetExample = new TreeSet<Integer>();

	public TreeSetExample () {
		treeSetExample.add(3);
		treeSetExample.add(1);
		treeSetExample.add(0);
		treeSetExample.add(2);
		
		System.out.println("Size : " +treeSetExample.size());
		System.out.println("Empty : " +treeSetExample.isEmpty());
		System.out.println("Hash Code : " +treeSetExample.hashCode());
		
		for (Integer intValue : treeSetExample) {
			System.out.println(intValue);
		}
		
		Iterator<Integer> iterator=treeSetExample.iterator();  
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		new TreeSetExample();
	}
}

package com.topics.map;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * A TreeMap contains values based on the key. It implements the *NavigableMap* interface and extends AbstractMap class.
 * It contains only unique elements.
 * It cannot have null key but can have multiple null values. <===
 * It is same as HashMap instead maintains ascending order. <===
 *
 */
public class TreeMapExample
{
	private TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();  
	
	public TreeMapExample() {
		treeMap.put(0, "Mukesh");
		treeMap.put(1, "Kusum");
		treeMap.put(2, "Prateek");
		treeMap.put(3, "Deepak");
		treeMap.put(4, "Sunita");
		treeMap.put(0, "Test"); // this will override the old value @ {0}
		
		for (Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("Key : "+entry.getKey() +" Value : "+entry.getValue());
		}
	}
	
	/**
	 * What is difference between HashMap and TreeMap?
	 * 
	 * 1) HashMap is can contain one null key.	--> 	TreeMap can not contain any null key.
	 * 2) HashMap maintains no order.			-->		TreeMap maintains ascending order.
	 */
	public static void main(String args[]) {
		new TreeMapExample();
	}



}

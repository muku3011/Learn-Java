package com.ocp.topics.map;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * A HashMap contains values based on the key. It implements the Map interface and extends AbstractMap class.
 * It contains only unique elements.
 * It may have one null key and multiple null values.
 * It maintains no order.
 *
 */
public class HashMapExample 
{
	private HashMap<Integer,String> hashMap=new HashMap<Integer,String>();  
	
	public HashMapExample() {
		hashMap.put(0, "Mukesh");
		hashMap.put(1, "Kusum");
		hashMap.put(2, "Prateek");
		hashMap.put(3, "Deepak");
		hashMap.put(4, "Sunita");
		hashMap.put(0, "Test"); // this will override the old value @ {0}
		
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key : "+entry.getKey() +" Value : "+entry.getValue());
		}
	}
	
	/**
	 * What is difference between HashSet and HashMap?
	 * 
	 * HashSet contains only values whereas HashMap contains entry(key and value).
	 */
	public static void main(String args[]) {
		new HashMapExample();
	}
}

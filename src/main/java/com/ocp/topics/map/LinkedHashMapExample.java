package com.ocp.topics.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
 * It contains only unique elements.
 * It may have one null key and multiple null values.
 * It is same as HashMap instead maintains insertion order.
 *
 */
public class LinkedHashMapExample {

	private LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();  
	
	public LinkedHashMapExample() {
		linkedHashMap.put(0, "Mukesh");
		linkedHashMap.put(1, "Kusum");
		linkedHashMap.put(2, "Prateek");
		linkedHashMap.put(3, "Deepak");
		linkedHashMap.put(4, "Sunita");
		linkedHashMap.put(0, "Test"); // this will override the old value @ {0}
		
		for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key : "+entry.getKey() +" Value : "+entry.getValue());
		}
	}
	
	public static void main(String args[]) {
		new LinkedHashMapExample();
	}

}

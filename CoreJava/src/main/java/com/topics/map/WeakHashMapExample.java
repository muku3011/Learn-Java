package com.topics.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * The key of WeakHashMap has weak reference. 
 * If the key has been garbage collected, then the entry in WeakHashMap object will automatically be deleted.
 * It does not happen in normal HashMap. The entry will not be deleted if the key is garbage collected.
 * Find the example below. In the example we have taken one HashMap and one WeakHashMap.
 * We will put entry in both the object and then later we will make the reference key as null and then garbage collected.
 * And again check the entry. In the HashMap object entry will be there but in WeakHashMap object there will not be entry present. 
 *
 */
public class WeakHashMapExample
{
	Map<String, String> hashMap= new HashMap<String, String>();
	Map<String, String> weakHashMap = new WeakHashMap<String, String>();
	
	public WeakHashMapExample() {
		
		String keyHashMap = "keyHashMap";
        String keyWeakHashMap = "keyWeakHashMap";
        
        hashMap.put(keyHashMap, "Ankita");
        weakHashMap.put(keyWeakHashMap, "Atul");
        System.gc();
        System.out.println("Before: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
        
        keyHashMap = null;
        keyWeakHashMap = null;
        
        System.gc();  
        
        System.out.println("After: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
	}

	public static void main(String[] args) {
		new WeakHashMapExample();
	}

}

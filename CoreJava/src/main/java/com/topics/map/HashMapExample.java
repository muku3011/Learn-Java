package com.topics.map;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * A HashMap contains values based on the key.
 * It contains only unique keys.
 * It may have one null key and multiple null values.
 * It maintains no order.
 *
 * Access/Search (HashMap.get)	O(n)	O(1)	O(n) is an extreme case when there are too many collisions
 * Insert/Edit (HashMap.set)	O(n)	O(1)	O(n) only happens with rehash when the Hash is 0.75 full
 * Delete (HashMap.delete)		O(n)	O(1)	O(n) is an extreme case when there are too many collisions
 */
public class HashMapExample {
    private HashMapExample() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Mukesh");
        hashMap.put(1, "Kusum");
        hashMap.put(2, "Prateek");
        hashMap.put(3, "Deepak");
        hashMap.put(4, "Sunita");
        hashMap.put(0, "Test"); // this will override the old value @ {0}

        for (Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }

    /**
     * What is difference between HashSet and HashMap?
     * <p>
     * HashSet contains only values whereas HashMap contains entry(key and value).
     */
    public static void main(String[] args) {
        new HashMapExample();
    }
}

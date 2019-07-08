package com.topics.map;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * IdentityHashMap as name suggests uses the equality operator(==) for comparing the keys.
 * So when you put any Key Value pair in it the Key Object is compared using == operator.
 * <p>
 * On the other hand HashMap uses equals method to determine the uniqueness of the Key.
 * <p>
 * The Keysize of Identity Map is 2 because here a and new String(�a�) are considered two different Object.
 * The comparison is done using == operator.
 */
public class IdentityHashMapExample {

    private IdentityHashMap<String, Double> identityHashMap = new IdentityHashMap<String, Double>();

    public IdentityHashMapExample() {
        // Put elements to the map
        identityHashMap.put("Zara", new Double(3434.34));
        identityHashMap.put("Mahnaz", new Double(123.22));
        identityHashMap.put("Ayan", new Double(1378.00));
        identityHashMap.put("Daisy", new Double(99.22));
        identityHashMap.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set<Entry<String, Double>> set = identityHashMap.entrySet();
        // Get an iterator
        Iterator<Entry<String, Double>> iterator = set.iterator();
        // Display elements
        while (iterator.hasNext()) {
            Entry<String, Double> identityHashMapValue = iterator.next();
            System.out.print(identityHashMapValue.getKey() + ": ");
            System.out.println(identityHashMapValue.getValue());
        }
        System.out.println();
        // Deposit 1000 into Zara's account
        double balance = identityHashMap.get("Zara").doubleValue();
        identityHashMap.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " +
                identityHashMap.get("Zara"));
    }


    public static void main(String[] args) {
        new IdentityHashMapExample();
    }
}

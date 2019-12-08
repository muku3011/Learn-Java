package com.topics.creational.singleton;

/**
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
 * Here is the sample code for creating Singleton class with this approach.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

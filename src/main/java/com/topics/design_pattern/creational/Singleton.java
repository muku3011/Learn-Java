package com.topics.design_pattern.creational;

/**
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a singleton class but it has a drawback that instance is created even though client application might not be using it.
 */
class EagerInitializedSingleton {

    //create a static object of SingleObject (EagerInitializedSingleton)
    private static final EagerInitializedSingleton singleton = new EagerInitializedSingleton();

    //make the constructor private so that this class cannot be instantiated
    private EagerInitializedSingleton() {
    }


    public static EagerInitializedSingleton getInstance() {
        return singleton;
    }

}

/**
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of class is created in the static block that provides option for exception handling.
 */
class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    //static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

/**
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
 * Here is the sample code for creating Singleton class with this approach.
 */
class LazyInitializedSingleton {

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

/**
 * The easier way to create a thread-safe singleton class is to make the global access method synchronized,
 * so that only one thread can execute this method at a time. General implementation of this approach is like the below class.
 */
class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}

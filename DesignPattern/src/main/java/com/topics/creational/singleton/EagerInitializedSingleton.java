package com.topics.creational.singleton;

/**
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a singleton class but it has a drawback that instance is created even though client application might not be using it.
 */
public class EagerInitializedSingleton {

    //create a static object of SingleObject (EagerInitializedSingleton)
    private static final EagerInitializedSingleton singleton = new EagerInitializedSingleton();

    //make the constructor private so that this class cannot be instantiated
    private EagerInitializedSingleton() {
    }


    public static EagerInitializedSingleton getInstance() {
        return singleton;
    }

}

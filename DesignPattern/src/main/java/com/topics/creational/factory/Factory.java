package com.topics.creational.factory;

/**
 * In Factory pattern, we create object without exposing the creation
 * logic to the client and refer to newly created object using a common interface.
 */
public class Factory {

    OS getInstance(String osType) {
        switch (osType) {
            case "Android":
                return new AndroidOS();
            case "iOS":
                return new AppleOS();
            case "Windows":
                return new WindowsOS();
            default:
                System.out.println("Type not defined returning null");
                return null;
        }
    }
}



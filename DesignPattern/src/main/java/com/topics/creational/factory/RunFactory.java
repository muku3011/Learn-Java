package com.topics.creational.factory;

public class RunFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();

        OS operatingSystem = factory.getInstance("iOS");
        operatingSystem.spec();

        operatingSystem = factory.getInstance("Android");
        operatingSystem.spec();

        operatingSystem = factory.getInstance("Windows");
        operatingSystem.spec();
    }
}

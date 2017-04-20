package com.topics.generics;

public class GenericMethods {

    public <T> void genericMethodDemo(T t) {

    }

    public <T extends Number> void genericMethodDemo1(T t) {

    }

    public <T extends Number & Runnable> void genericMethodDemo2(T t) {

    }

    public <T extends Cloneable & Runnable> void genericMethodDemo3(T t) {

    }

}

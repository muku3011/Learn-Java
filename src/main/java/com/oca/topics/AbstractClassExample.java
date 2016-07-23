package com.oca.topics;

import java.io.EOFException;

abstract class AbstractClass {

    private int a;
    int b;
    abstract public void updateThisMethod() throws Exception;

    public static void updatedMethod() {
        System.out.println("Method with implementation");
    }

}

class ConcreteClass extends AbstractClass {

    public ConcreteClass () {
        System.out.println(b);
    }

    @Override
    public void updateThisMethod() throws EOFException {
        System.out.println("Implementation provided");
    }

    public static void main(String[] args) {
        new ConcreteClass();
    }
}

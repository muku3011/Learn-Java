package com.topics.object_orientation;

class ConcretedClass implements InterfaceClass {

    private ConcretedClass() {
        System.out.println(InterfaceA.FINAL_VALUE);
        System.out.println(InterfaceClass.BAR +" "+TEST);
    }

    @Override
    public void updateMethod() {
        System.out.println("Implementation provided");
    }

    public static void main(String[] args) {
        new ConcretedClass().updateMethod();
    }

    @Override
    public void methodA() {
        System.out.println("Method A implementation provided");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implementation provided");
    }
}

interface InterfaceClass extends InterfaceA, InterfaceB {   //By default an interface is public abstract
    int BAR = 56;                                           //By default variables inside interface are public static final
    int TEST = 42;                      //Actual data_types

    void updateMethod();
}

interface InterfaceA {
    int FINAL_VALUE = 50;

    void methodA();
}

interface InterfaceB {
    int FINAL_VALUE = 500;

    void methodB();
}
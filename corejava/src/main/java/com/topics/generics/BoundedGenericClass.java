package com.topics.generics;

/**
 * Bounded Types in Generic
 * <T extends X>
 * X can be Class or Interface : BoundedGenericClass<T extends Number> OR BoundedGenericClass<T extends Runnable>
 * We can define bounded type even in combination : BoundedGenericClass<T extends Number & Runnable>
 * <p>
 * Mention Class first, before interfaces   :   BoundedGenericClass<T extends Number & Runnable>    (Valid)
 * BoundedGenericClass<T extends Runnable & Number>    (InValid)
 * One than one class can not be taken      :   BoundedGenericClass<T extends Thread & Number>      (InValid)
 * <p>
 * We can declare any number of Type Parameters, and all these type parameters should be separated with ','.
 * <p>
 * class Test <X, Y, Z> {}
 * class Test <X, Y> {}
 */
public class BoundedGenericClass<T extends Number> {

    private T t;

    BoundedGenericClass(T t) {
        this.t = t;
        new Thread();
    }

    public void setValue(T value) {
        t = value;
    }

    public T getValue() {

        return t;
    }

}

class RunBoundedGeneric {

    public static void main(String[] args) {

        BoundedGenericClass<Integer> boundedGenericClass = new BoundedGenericClass<>(25);

        System.out.println(boundedGenericClass.getValue());
    }
}
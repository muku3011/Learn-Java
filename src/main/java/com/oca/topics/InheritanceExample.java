package com.oca.topics;

class SuperClass {
    int a = 10;
    String s = "mukesh";

    private String sum (int x, String y) {
        System.out.println("Sum is : " +(x+y));
        return (x+y);
    }

    protected void methodOverride() throws Throwable {
        System.out.println("Super class method");
    }
}

class BaseClass extends SuperClass {

    private int a = 20;
    private String s = "joshi";

    public static void main(String[] args) {
        //************************************//
        //  Class reference and Class object  //
        //************************************//

        //BaseClass baseClass = new SuperClass();                   // Super class object can not be referenced as base class.
        SuperClass superReferenceBaseObject = new BaseClass();      // Base class object can be referenced as Super class.

        BaseClass baseClassObject = new BaseClass();
        SuperClass superClassObject = new SuperClass();

        System.out.println(superReferenceBaseObject.a+" "+superReferenceBaseObject.s);
        System.out.println(baseClassObject.a+" "+baseClassObject.s);    // Variables are accessed on the basis of
        System.out.println(superClassObject.a+" "+superClassObject.s);  // reference type not the object.

        //************************************//
        //  Class private method overloading  //
        //************************************//
        int a = 20;
        String s = "joshi";
        System.out.println(new BaseClass().sum(a, s));
        //System.out.println(new SuperClass().sum(a, s));           // Private methods are accessible only inside class

        //************************************//
        //      Class  method overloading     //
        //************************************//
        try {
            new SuperClass().methodOverride();
            new BaseClass().methodOverride();
        } catch (Throwable ex) {                                // Multiple exception in catch (|) should be disjoint
            System.out.println("Exception handled");            // not related to each other, no relationship.
        }
    }

    private String sum (int x, String y) {
        //System.out.println("Sum is : " +(x+y));
        return (x+y);
    }

    protected void methodOverride() throws Exception {  // Overridden method can define same exception , subclass exception or no exception.
        System.out.println("Base class method");
    }
}





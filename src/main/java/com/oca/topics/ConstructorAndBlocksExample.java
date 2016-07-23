package com.oca.topics;

/**
 * A constructor can't ever, ever, ever, have a return type…ever
 *
 * Constructors can't be marked static (they are after all associated with object instantiation),
 *
 * and they can't be marked final or abstract (because they can't be overridden).
 *
 * Constructor declarations can however have all of the normal access modifiers
 *
 *
 * A static initialization block runs once, when the class is first loaded.
 *
 * An instance initialization block runs once every time a new instance is created.
 *
 * Instance init block code runs right after the call to super() in a constructor—in other words, after all super constructors have run.
 *
 * If a class has more than one initialization blocks, they will run in the order in which they appear in the class file—in other words, from the top down.
 *
 * Static methods can't be overridden! This doesn't mean they can't be redefined in a subclass, but redefining and overriding aren't the same thing.
 */
class ParentClass {
    int number;
    String name;
    private static int count;                   // Declare static variable

    protected ParentClass() { }         // this is ParentClass's constructor
    protected void ParentClass() { }    // this is a badly named, but legal method

    ParentClass(int number, String name) {
        count += 1;                     // Modify static variable value in the constructor
        this.number = number;
        this.name = name;
        System.out.println("2. Super class constructor |name is : " + name + " and number is : " + number);
    }

    static {
        System.out.println("Static initialization block");
    } // static init block

    {
        System.out.println("Instance initialization block");
    } // instance init block

}

class ChildClass extends ParentClass {

    // Static block, called only once
    static {
        System.out.println("1. Static block");
        new ChildClass();
    }

    // Initialization bloc, called every-time a new instance of this class is created
    {
        System.out.println("3. Initialization block");
    }

    private ChildClass() {
        super(1602, "Mukesh");
        System.out.println("4. Child class constructor");

        ParentClass parentClass = new ParentClass(123, "Joshi");
        valuePassCheck(parentClass);
        System.out.println("After passing object as reference |name is : " + parentClass.name + " and number is : " + parentClass.number);
    }

    private void valuePassCheck(ParentClass parentClass) {
        parentClass.name = "Changed";
        parentClass.number = 10000;
    }

    public static void main(String[] args) {
        System.out.println("Java version            :   "+System.getProperty("java.specification.version"));
        System.out.println("Operating System        :   "+System.getProperty("os.name"));
    }

}

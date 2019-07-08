package com.topics.enum_types;

/**
 * Lets you restrict a variable to having one of only a few predefined values.
 *
 * enums can be declared as their own separate class or as a class member; however, they must not be declared within a method!.
 *
 * optional to put a semicolon at the end of the enum data_types.
 *
 * each enum value knows its index or position—in other words, the order in which enum values are declared matters.
 *
 * enum really is a special kind of class. You can add constructors, instance variables and methods.
 *
 * Note: Every enum has a static method, values(), that returns an array of the enum's values in the order they're declared.
 *
 *
 * You can NEVER invoke an enum constructor directly. The enum constructor is invoked automatically,
 * with the arguments you define after the constant value.
 *
 * You can define more than one argument to the constructor, and you can overload the enum constructors, just as you can overload a normal class.
 */
enum Enums {
    // 8, 10 & 16 are passed to the constructor
    BIG(8), HUGE(10), OVERWHELMING(16);
    Enums(int ounces) { // constructor
        this.ounces = ounces;
    }
    private int ounces; // an instance variable
    public int getOunces() {
        return ounces;
    }
}

class Coffee {
    Enums size; // each instance of Coffee has an enum
    public static void main(String[] args) {
        Coffee drink1 = new Coffee();
        drink1.size = Enums.BIG;
        Coffee drink2 = new Coffee();
        drink2.size = Enums.OVERWHELMING;
        System.out.println(drink1.size.getOunces()); // prints 8
        for(Enums cs: Enums.values())
            System.out.println(cs + " " + cs.getOunces());
    }
}

enum CoffeeSize {
    BIG(8),
    HUGE(10),
    OVERWHELMING(16) {                  // start a code block that defines

        // the "body" for this constant
        public String getLidCode() {    // override the method
                                        // defined in CoffeeSize
            return "A";
        }
    };                                  // the semicolon is REQUIRED when more code follows

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
        return ounces;
    }

    public String getLidCode() {        // this method is overridden
                                        // by the OVERWHELMING constant
        return "B";                     // the default value we want to
                                        // return for CoffeeSize constants
    }
}


enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;

    Animals(String s) {
        sound = s;
    }
}

class TestEnum {
    static Animals a;

    public static void main(String[] args) {
        System.out.println(Animals.DOG.sound + " " + Animals.FISH.sound);
    }
}

class TestDays {
    public enum Days {MON, TUE, WED}

    public static void main(String[] args) {
        for (Days d : Days.values()) ;


        Days[] d2 = Days.values();
        System.out.println(d2[2]);
    }
}

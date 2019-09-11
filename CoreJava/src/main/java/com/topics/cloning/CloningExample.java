package com.topics.cloning;

/**
 * Object cloning refers to creation of exact copy of an object.
 * It creates a new instance of the class of current object and initializes
 * all its fields with exactly the contents of the corresponding fields of this object.
 */
public class CloningExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        shallowCopy();

        deepCopy();
    }

    private static void shallowCopy() throws CloneNotSupportedException {
        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.id = 100;
        shallowCopy.name = "BeforeClone";
        shallowCopy.reference.id = 10;
        shallowCopy.reference.name = "BeforeClone";

        ShallowCopy newShallowCopy = (ShallowCopy) shallowCopy.clone();

        newShallowCopy.id = 200;
        newShallowCopy.name = "AfterClone";
        newShallowCopy.reference.id = 500;
        newShallowCopy.reference.name = "AfterClone";

        System.out.println(shallowCopy);
        System.out.println(newShallowCopy);
    }

    private static void deepCopy() throws CloneNotSupportedException {
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.id = 100;
        deepCopy.name = "BeforeClone";
        deepCopy.reference.id = 10;
        deepCopy.reference.name = "BeforeClone";

        DeepCopy newDeepCopy = (DeepCopy) deepCopy.clone();

        newDeepCopy.id = 200;
        newDeepCopy.name = "AfterClone";
        newDeepCopy.reference.id = 500;
        newDeepCopy.reference.name = "AfterClone";

        System.out.println(deepCopy);
        System.out.println(newDeepCopy);
    }
}

/**
 * Shallow copy is method of copying an object and is followed by default in cloning.
 * In this method the fields of an old object X are copied to the new object Y.
 * While copying the object type field the reference is copied to Y i.e object Y will point to same location as pointed out by X.
 * If the field value is a primitive type it copies the value of the primitive type.
 * Therefore, any changes made in referenced objects in object X or Y will be reflected in other object.
 */
class ShallowCopy implements Cloneable {

    int id;
    String name;
    Reference reference = new Reference();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reference=" + reference +
                '}';
    }
}

/**
 * If we want to create a deep copy of object X and place it in a new object Y then new copy of any referenced objects fields are created and these references are placed in object Y.
 * This means any changes made in referenced object fields in object X or Y will be reflected only in that object and not in the other.
 * In below example, we create a deep copy of object.
 * A deep copy copies all fields, and makes copies of dynamically allocated memory pointed to by the fields.
 * A deep copy occurs when an object is copied along with the objects to which it refers.
 */
class DeepCopy implements Cloneable {

    int id;
    String name;
    Reference reference = new Reference();

    public Object clone() throws CloneNotSupportedException {
        // Assign the shallow copy to new reference variable deepCopy
        DeepCopy deepCopy = (DeepCopy) super.clone();

        deepCopy.reference = new Reference();

        // Create a new object for the field reference
        // and assign it to shallow copy obtained,
        // to make it a deep copy
        return deepCopy;
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reference=" + reference +
                '}';
    }
}


// A test Reference class whose objects are cloned
class Reference {
    int id;
    String name;

    @Override
    public String toString() {
        return "Reference{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
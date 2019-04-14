package com.topics.generics;

import java.util.ArrayList;

public class GenericWildCardCharacters {

    public void generic(ArrayList<String> objects) {

    }

    /**
     * Best suitable for read-only operation, not suitable for write.
     *
     * @param objects
     */
    public void genericWildCard(ArrayList<?> objects) {                                 //Only null can be added

    }

    /**
     * Best suitable for read-only operation, not suitable for write.
     *
     * @param objects
     */
    public void genericWildCardWithExtends(ArrayList<? extends Number> objects) {       //Only null can be added

    }

    /**
     * Only allowed in method not at class level 'super'
     * <p>
     * For class, that class and its super classes
     * For interface, that interface and super classes of Interface implementations.
     *
     * @param objects
     */
    public void genericWildCardWithSuper(ArrayList<? super Number> objects) {           //Can add Number type object as well as number.

    }

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<?> list2 = new ArrayList<>();
        ArrayList<?> list3 = new ArrayList<String>();
        ArrayList<?> list4 = new ArrayList<>();
        ArrayList<? extends Number> list5 = new ArrayList<Integer>();
        //ArrayList<? extends Number> list6 = new ArrayList<String>();
        ArrayList<? super String> list7 = new ArrayList<Object>();
        //ArrayList<?> list8 = new ArrayList<?>();
        //ArrayList<?> list8 = new ArrayList<? extends  Number>();

    }

}

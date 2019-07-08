package com.topics.special_classes;

import java.util.*;

final public class ImmutableClass {

    private final int anInt;
    private final String string;
    private final Integer integer;
    private final List<String> stringList;
    private final Date date;
    private final MutableClass mutableClass;

    ImmutableClass(int anInt, String string, Integer integer, List<String> stringList, Date date, MutableClass mutableClass) {
        this.anInt = anInt;
        this.string = string;
        this.integer = integer;
        this.stringList = stringList;
        this.date = date;
        this.mutableClass = mutableClass;
    }

    int getAnInt() {
        return anInt;
    }

    public String getString() {
        return string;
    }

    Integer getInteger() {
        return integer;
    }

    List<String> getStringList() {
        return Collections.unmodifiableList(stringList);
    }

    Date getDate() {
        return new Date(date.getTime());
    }

    MutableClass getMutableClass() {
        return new MutableClass(this.mutableClass.getName());
    }
}

class TestImmutableClass {
    public static void main(String[] args) {
        MutableClass mutableClass = new MutableClass("Mukesh");

        int anInt = 5;
        String string = "string";
        Integer integer = 10;
        List<String> stringList = Arrays.asList("first", "second");
        Date date = new Date(1234456789);
        ImmutableClass immutableClass = new ImmutableClass(anInt, string, integer, stringList, date, mutableClass);

        System.out.println("***********Inside immutable class***********");
        print(immutableClass);

        immutableClass.getDate().setTime(99999);
        immutableClass.getMutableClass().setName("Joshi");

        System.out.println("\n");
        System.out.println("***********Changing immutable object values***********");
        print(immutableClass);
    }

    private static void print(ImmutableClass immutableClass) {
        System.out.println("int             : " + immutableClass.getAnInt());
        System.out.println("string          : " + immutableClass.getString());
        System.out.println("Integer         : " + immutableClass.getInteger());
        System.out.println("StringList      : " + immutableClass.getStringList());
        System.out.println("Date            : " + immutableClass.getDate());
        System.out.println("Mutable class   : " + immutableClass.getMutableClass().getName());
    }
}

class MutableClass {
    private String name;
    MutableClass(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

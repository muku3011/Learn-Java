package com.xtra.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class DemoClass {

    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class RunReflection {
    public static void main(String[] args) throws ClassNotFoundException {

        Class aClass = Class.forName("com.xtra.reflection.DemoClass");

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}



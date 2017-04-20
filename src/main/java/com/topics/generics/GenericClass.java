package com.topics.generics;

public class GenericClass<TYPE_PARAMETER> {

    private TYPE_PARAMETER typeParameter;

    GenericClass(TYPE_PARAMETER typeParameter) {
        this.typeParameter = typeParameter;
    }

    public void setValue(TYPE_PARAMETER value) {
        typeParameter = value;
    }

    public TYPE_PARAMETER getValue() {

        return typeParameter;
    }

}

class RunGeneric {

    public static void main(String[] args) {
        GenericClass<String> stringGenericClass = new GenericClass<>("joshi");

        System.out.println(stringGenericClass.getValue());
    }

}
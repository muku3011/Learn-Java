package com.oca.topics;


public class SampleClass {

    char c = 'a';

    int i = 5;
    float f = 5.5f;

    boolean b = true | false;
    boolean y = true || false;


    private SampleClass() {
        System.out.println(c);

    }

    public static void main(String[] args) {

        //int i = 5;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';
       // if (i == f) c++;
        //System.out.println((int)++c);
        if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
        //System.out.println(c);

        do { break ; } while (true) ;



        new SampleClass();
    }
}

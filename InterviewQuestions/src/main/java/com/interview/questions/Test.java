package com.interview.questions;

import java.util.Date;
import java.util.StringTokenizer;

public class Test {

    public static void main(String[] args) {
        StringTokenizer tokens =  new StringTokenizer("muk mesh", "m");


        System.out.println(tokens.countTokens());


        while (tokens.hasMoreElements()) {
            System.out.println(tokens.nextElement());
        }



        try{
            Date date = new Date(0);
            System.out.println(date);

            System.out.println();
        } catch (Exception e) {
            e.getSuppressed();
        }
    }

}

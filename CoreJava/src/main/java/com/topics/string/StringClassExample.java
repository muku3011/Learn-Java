package com.topics.string;

public class StringClassExample {

    private void stringSample() {
        String str1 = "Hellos";
        String str2 = "Hello";

        String str3 = "Hello Again";
        String str4 = "Hello Again";

        System.out.println(".equals : " + str1.equals(str2) + " and == : " + (str1 == str2));
        System.out.println(".equals : " + str3.equals(str4) + " and == : " + (str3 == str4));

        String str6 = "HellosIndia";
        String str5 = "HellosIndia";

        System.out.println(".equals : " + str5.equals(str6) + " and == : " + (str5 == str6));

    }
}

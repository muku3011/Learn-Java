package com.oca.programs;

public class StringReverseWithSpace {

    private static String value = "my name is mukesh";

    public static void main(String[] args) {

        char[] chars = value.toCharArray();
        int length = chars.length;
        char[] newArray = new char[length];
        for (int i = 0; i < length; i++) {

            if (chars[i] == ' ') {
                System.out.println((length - 1) - i);
                newArray[i] = ' ';
            } else {
                newArray[i] = chars[(length - 1) - i];
            }
            System.out.println(newArray);
        }
        System.out.println(String.valueOf(newArray));
    }

}

package com.oca.programs;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string value : ");
        String originalString = scanner.next();

        char[] chatArray = originalString.toCharArray();

        for (int i = 0; i < (chatArray.length / 2); i++) {
            char temp = chatArray[i];
            chatArray[i] = chatArray[(chatArray.length-1)-i];
            chatArray[(chatArray.length-1)-i] = temp;
        }

        System.out.println("Original String is : "+originalString);
        System.out.println("Revere String is : "+new String(chatArray));
    }
}

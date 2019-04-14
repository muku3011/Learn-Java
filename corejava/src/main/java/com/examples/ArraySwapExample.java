package com.examples;

/**
 * WAP to swap half values with one-n-other in an even array.
 * e.g  :   {1 2 3 4 5 6 7 8}
 * Result : {1 5 2 6 3 7 4 8}
 */
public class ArraySwapExample {

    public static void main(String[] args) {
        char[] test = {'1', '2', '3', '4', '5', '6'};
        int mid = test.length / 2;
        int a = 1;
        while (a < test.length) {
            char temp = test[a];
            test[a] = test[mid];
            test[mid] = temp;
            System.out.println(temp + " " + test[a]);
            a = a + mid;
        }
        System.out.println(test);
    }

}

package com.oca.programs;


public class PrintDifferentPyramids {

    public static void main(String[] args) {
        //printLeftPyramid(5);
        printRightPyramid(5);
    }

    private static void printLeftPyramid(int noOfRows) {
        for (int i = 0; i < noOfRows; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    private static void printRightPyramid(int noOfRows) {
        for (int i = noOfRows; i > 0; i--) {
            System.out.print(" ");
            System.out.print(i);
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
                System.out.println();
            }
        }
    }
}

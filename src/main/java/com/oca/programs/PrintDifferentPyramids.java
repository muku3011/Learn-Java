package com.oca.programs;


public class PrintDifferentPyramids {

    public static void main(String[] args) {

        printTriangle();

    }

    private static void printTriangle() {
        for (int i = 0; i < 6; i++) {
            System.out.println("*");
            for (int j=6; j > 0; j--) {
                System.out.println("*");
            }
        }
    }

}

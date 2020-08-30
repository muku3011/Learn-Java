package com.topics.Recursion;

public class FactorialExample {
    public static int factorial(int a) {
        if (a == 1) {
            return 1;

        } else {
            return (a* factorial(a - 1));
        }
    }

    public static void main(String[] args) {
        int result = factorial(5);
        int result1 = factorial(4);
        System.out.println("The factorial of a number is: " + result);
        System.out.println("The factorial of a number is: " + result1);
    }
}

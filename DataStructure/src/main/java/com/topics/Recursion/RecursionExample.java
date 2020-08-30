package com.topics.Recursion;

public class RecursionExample {
    static int count = 0;

    static void print() {
         count++;
        if (count <= 5) {
            System.out.println("hello " + count);
            print();

        }
    }

    public static void main(String[] args) {
        print();
    }
}


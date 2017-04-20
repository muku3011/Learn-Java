package com.topics.data_structure.searching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 1, 8, 30, 15};
        System.out.println(search(arr, 20));
    }

    private static int search(int[] arr, int a) {
        int counter = 0;
        for (int value : arr) {
            if (value == a) {
                return counter;
            }
            counter++;
        }
        return -1;
    }

}

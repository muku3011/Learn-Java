package com.topics.sorting;

import java.util.Arrays;

public class SortingExample {

    static int[] unsortedArray = {20, 35, -15, 7, 55, 1, -22};

    public static void main(String[] args) {

        Sort sort = new Bubble();
        int[] sortedArray = sort.sort(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

        sort = new Selection();
        sortedArray = sort.sort(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

    }
}

package com.topics.data_structure.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 15, 30, 45, 70, 90};
        int searchCharacter = 3;

        int index = search(arr, searchCharacter);
        System.out.println("Final Index : " + index);
        System.out.println("Final Value : " + arr[index]);
    }

    private static int search(int[] sortedArray, int searchCharacter) {
        System.out.println("Array length : " + sortedArray.length);
        int center = ((sortedArray.length % 2 == 0) ? (sortedArray.length / 2) : (sortedArray.length + 1) / 2) - 1;
        System.out.println("Center : " + center);

        if (center < 0) {
            return -1;
        }

        if (sortedArray[center] == searchCharacter) {
            center = center + 1;
            System.out.println("In center : " + center);
        } else if (sortedArray[center] > searchCharacter) {
            System.out.println("searchCharacter [ " + searchCharacter + " ] is smaller than center [ " + sortedArray[center] + "]");
            int[] subArray = Arrays.copyOfRange(sortedArray, 0, center);
            printArray(subArray);
            center = search(subArray, searchCharacter);
            center = center - subArray.length;
        } else {
            System.out.println("searchCharacter [ " + searchCharacter + " ] is greater than center [ " + sortedArray[center] + "]");
            int[] subArray = Arrays.copyOfRange(sortedArray, center + 1, (sortedArray.length));
            printArray(subArray);
            center = search(subArray, searchCharacter);
            center = center + subArray.length;
        }
        return center;
    }

    private static void printArray(int[] subArray) {
        for (int a : subArray) {
            System.out.print(a + "\t");
        }
        System.out.println();
    }
}

package com.topics.sorting;

public class Bubble implements Sort {

    @Override
    public int[] sort(int[] unsortedArray) {

        for (int lastUnsortedIndex = unsortedArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                swap(unsortedArray, j, j + 1);
            }
        }
        return unsortedArray;
    }

    private void swap(int[] unsortedArray, int firstIndex, int secondIndex) {
        if (unsortedArray[firstIndex] > unsortedArray[secondIndex]) {
            int temp = unsortedArray[firstIndex];
            unsortedArray[firstIndex] = unsortedArray[secondIndex];
            unsortedArray[secondIndex] = temp;
        }
    }
}

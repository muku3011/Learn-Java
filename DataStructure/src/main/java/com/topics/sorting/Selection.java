package com.topics.sorting;

public class Selection implements Sort {

    @Override
    public int[] sort(int[] unsortedArray) {

        for (int lastUnsortedIndex = unsortedArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (unsortedArray[i] > unsortedArray[largest]) {
                    largest = i;
                }
                swap(unsortedArray, largest, lastUnsortedIndex);
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

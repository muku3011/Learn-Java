package com.interview.questions.array;

public class ArrayQuestion implements IArray {

    public int getArrayMaxValue(int[] intArray) {
        int maxValue = intArray[0];
        for (int value : intArray) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public int getArrayMinValue(int[] intArray) {
        int minValue = intArray[0];
        for (int arrayValue : intArray) {
            if (arrayValue < minValue) {
                minValue = arrayValue;
            }
        }
        return minValue;
    }
}

package com.examples;

public class ArrayMinMaxValues {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 102, 4, 5, 6, 7, 8, 9, -100, 101};
        System.out.println("Array max value is : " + getArrayMaxValue(intArray) + " and min value is : " + getArrayMinValue(intArray));
    }

    private static int getArrayMaxValue(int[] intArray) {
        int maxValue = 0;
        for (int value : intArray) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    private static int getArrayMinValue(int[] intArray) {
        int minValue = intArray[0];
        for (int value : intArray) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}

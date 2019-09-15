package com.topics.collection.list;

/**
 * Array can contains primitives data types as well as objects of a class depending on the definition of array.
 * In case of primitives data types, the actual values are stored in contiguous memory locations.
 * In case of objects of a class, the actual objects are stored in heap segment.
 *
 * The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types)
 *
 * When you clone a single dimensional array, such as Object[], a 'deep copy'is performed
 * with the new array containing copies of the original array’s elements as opposed to references.
 *
 * A clone of a multidimensional array (like Object[][]) is a 'shallow copy' however,
 * which is to say that it creates only a single new array with each element array a reference to an original element array but subarrays are shared.
 *
 *  O(1)	Insert element to the end of the array
 *  O(1)	Remove element to the end of the array
 *  O(n)	Remove element to the beginning of the array
 *  O(n)	Insert element(s) to the beginning of the array
 *  O(n)	Returns a copy of the array from beginning to end.
 *  O(n)	Changes (add/remove) the array
 *  O(n)	Search the array
 *
 */
public class ArrayExample {

    static int[] intArray = new int[20];

    static int[] intArray1 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

    static int[][] int2DArray = new int[10][20]; //a 2D array or matrix

    static int[][][] int3DArray = new int[10][20][10]; //a 3D array

    public static void main(String[] args) {
    }

}

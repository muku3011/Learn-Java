package com.interview.questions.array;

import com.interview.questions.ArrayQuestion;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class ArrayQuestionTest {

    private static ArrayQuestion arrayQuestion;

    private int[] intArray = {1, 2, 3, 102, 4, 5, 6, 7, 8, 9, -100, 101};

    @BeforeAll
    static void setUp() {
        arrayQuestion = new ArrayQuestion();
    }

    @Test
    void getArrayMaxValueTest() {
        assertEquals(102, arrayQuestion.getArrayMaxValue(intArray));
    }

    @Test
    void getArrayMinValueTest() {
        assertEquals(-100, arrayQuestion.getArrayMinValue(intArray));
    }


    @Test
    void uniqueElementTest() {
        Integer[] intArray = {1, 2, 3, 1, 4, 6, 7, 4, 0};

        List<Integer> unique = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();

        for (int item : intArray) {
            if (unique.contains(item)) {
                duplicate.add(item);
                unique.remove(item);
            } else {
                unique.add(item);
            }
        }
        System.out.println("Unique: " + unique);
        System.out.println("Duplicate: " + duplicate);
    }


}
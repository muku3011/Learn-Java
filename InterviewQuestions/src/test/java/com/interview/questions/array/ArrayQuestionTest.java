package com.interview.questions.array;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayQuestionTest {

    private static IArray arrayQuestion;

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


}

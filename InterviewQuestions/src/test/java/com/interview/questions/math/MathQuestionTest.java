package com.interview.questions.math;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathQuestionTest {

    private static IMath mathQuestion;

    private int of = 8;

    @BeforeAll
    static void setUp() {
        mathQuestion = new MathQuestion();
    }

    @Test
    void getFactorialTest() {
        assertEquals(40320, mathQuestion.firstFactorial(of));
    }

    @Test
    void getFactorialWithRecursionTest() {
        assertEquals(40320, mathQuestion.firstFactorialWithRecursion(of));
    }

    @Test
    void printPyramidTest() {
        String expectedLeftPyramid = "\n" +
                " *\n" +
                " * *\n" +
                " * * *\n" +
                " * * * *\n" +
                " * * * * *";
        assertEquals(expectedLeftPyramid, mathQuestion.printLeftPyramid(5));

        String expectedRightPyramid = "\n" +
                " * * * * *\n" +
                " * * * *\n" +
                " * * *\n" +
                " * *\n" +
                " *";
        assertEquals(expectedRightPyramid, mathQuestion.printRightPyramid(5));
    }
}

package com.interview.questions.thread;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreadQuestionTest {

    private static OddEvenExample thread;

    @BeforeAll
    static void setUp() {
        thread = new OddEvenExample();
    }

    @Test
    void setOddEvenExampleTest() {
        List<Integer> sampleList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        thread.printOddEvenUsingThreads();
        assertEquals(sampleList , thread.oddEvenList);
    }
}

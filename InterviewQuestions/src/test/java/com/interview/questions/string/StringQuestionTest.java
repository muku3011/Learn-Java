package com.interview.questions.string;

import com.interview.questions.StringQuestion;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringQuestionTest {

    private static StringQuestion stringQuestion;

    @BeforeAll
    static void setUp() {
        stringQuestion = new StringQuestion();
    }

    @Test
    void moveToNextLetterTest() {
        assertEquals("E", stringQuestion.moveToNextLetter("d"));
        assertEquals("b", stringQuestion.moveToNextLetter("a"));
        assertEquals("tqh", stringQuestion.moveToNextLetter("spg"));
        assertEquals("Efnp", stringQuestion.moveToNextLetter("demo"));
    }

    @Test
    void reverseStringTest() {
        assertEquals("omed", stringQuestion.reverseString("demo"));
        assertEquals("ihsoJhsekuM", stringQuestion.reverseStringUsingRecursion("MukeshJoshi"));
        assertEquals("iJihso Jhsek uM", stringQuestion.reverseStringWithSpaces("Mukesh Joshi Ji"));
    }
}

package com.interview.questions.string;

public interface IString {

    /**
     * Replace each character with the next character, e.g., b->c, spg->tqh
     * If next character is a vowel make it capital, e.g., d->E, demo->Efnp
     * @param stringSample, string sample for which we want to perform this operation
     * @return string object whose letters are moved.
     */
    String moveToNextLetter(String stringSample);

    String reverseString(String originalString);

    String reverseStringUsingRecursion(String originalString);

    /**
     * Reverse a given string with preserving the position of spaces
     * @param originalString, original string which needs to be reverted
     * @return reverted string with preserved spaces
     */
    String reverseStringWithSpaces(String originalString);
}

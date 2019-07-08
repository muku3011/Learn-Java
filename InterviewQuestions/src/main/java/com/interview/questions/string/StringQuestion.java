package com.interview.questions.string;

public class StringQuestion implements IString {

    public String moveToNextLetter(String stringSample) {

        char[] charArray = stringSample.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + 1);
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
                charArray[i] = String.valueOf(charArray[i]).toUpperCase().toCharArray()[0];
            }
        }
        return new String(charArray);
    }

    public String reverseString(String originalString) {
        char[] chatArray = originalString.toCharArray();

        for (int i = 0; i < (chatArray.length / 2); i++) {
            char temp = chatArray[i];
            chatArray[i] = chatArray[(chatArray.length - 1) - i];
            chatArray[(chatArray.length - 1) - i] = temp;
        }
        return new String(chatArray);
    }

    public String reverseStringUsingRecursion(String str) {
        if ((str == null) || (str.length() <= 1)) {
            return str;
        }
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    public String reverseStringWithSpaces(String originalString) {
        char[] inputArray = originalString.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = result.length - 1;

        for (char c : inputArray) {
            if (c != ' ') {
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = c;
                j--;
            }
        }
        System.out.println(originalString + " --> " + String.valueOf(result));
        return String.valueOf(result);
    }
}

package com.interview.questions.math;

public class MathQuestion implements IMath {

    public int firstFactorial(int num) {
        for (int x = num - 1; x >= 1; x--) {
            num = num * x;
        }
        return num;
    }

    public int firstFactorialWithRecursion(int num) {
        return (num == 1 ? 1 : num * firstFactorial(num - 1));
    }

    public String printLeftPyramid(int noOfRows) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < noOfRows; i++) {
            stringBuilder.append("\n");
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(" ");
                stringBuilder.append("*");
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public String printRightPyramid(int noOfRows) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = noOfRows; i > 0; i--) {
            stringBuilder.append("\n");
            for (int j = 0; j < i; j++) {
                stringBuilder.append(" ");
                stringBuilder.append("*");
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

}

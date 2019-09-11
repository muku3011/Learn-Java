package com.interview.questions.aws;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AWSQuestions {

    public static List<Integer> cellCompete(int[] states, int days) {

        int[] competition = states;
        for (int i = 0; i < days; i++) {
            competition = compete(competition);
        }
        return Arrays.stream(competition).boxed().collect(Collectors.toList());
    }

    private static int[] compete(int[] states) {

        int leftHouseState;
        int rightHouseState;
        int[] newHouseState = new int[states.length];
        for (int i = 0; i < states.length; i++) {
            leftHouseState = (i == 0) ? 0 : states[i - 1];
            rightHouseState = (i == (states.length - 1)) ? 0 : states[i + 1];
            if ((leftHouseState == 0 && rightHouseState == 0) || (leftHouseState == 1 && rightHouseState == 1)) {
                newHouseState[i] = 0;
            } else {
                newHouseState[i] = 1;
            }
        }
        return newHouseState;
    }

    public static void main(String[] args) {
/*        int[] houses = {1, 1, 1, 0, 1, 1, 1, 1};
        List<Integer> test = cellCompete(houses, 2);
        System.out.println(test);*/

        int[] integers = {2, 4, 9, 12, 30};
        System.out.println(generalizedGCD(5, integers));
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int generalizedGCD(int num, int[] arr) {

        int gdd = 1;

        outer:
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                if (arr[j] % arr[i] != 0) {
                    System.out.println("Failed for " + arr[j] + " % " + arr[i]);
                    break outer;
                }
            }
            gdd = arr[i];
        }
        return gdd;
    }
}
// METHOD SIGNATURE ENDS


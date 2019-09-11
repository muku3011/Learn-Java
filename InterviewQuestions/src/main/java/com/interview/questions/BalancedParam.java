package com.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParam {

    private static Map<Character, Character> characterMap = new HashMap<>();

    public static void main(String[] args) {

        characterMap.put('[', ']');
        characterMap.put('{', '}');
        characterMap.put('(', ')');

        String expression = "[{}([])[]])";

        Stack<Character> characters = new Stack<>();
        for (Character exp : expression.toCharArray()) {

            // if expression is of OPEN type
            if (characterMap.containsKey(exp)) {
                characters.push(exp);
                // If expression is of close type, then the open expression of that will be in the top of the stack
            } else {
                if(characters.isEmpty()) {
                    System.out.println("not correct");
                    return;
                }
                Character character = characters.pop();
                if (!characterMap.get(character).equals(exp)) {
                    System.out.println("Not correct");
                }
            }
        }
        if (characters.isEmpty()) {
            System.out.println("correct");
        } else {
            System.out.println("Not correct");
        }
    }

}

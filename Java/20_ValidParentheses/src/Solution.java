package org.m3mpm;

import java.util.List;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        boolean result = true;
        Stack<Character> stack = new Stack<>();

        // Creating lists for opening and closing brackets
        List<Character> openBrackets = List.of('(', '[', '{');
        List<Character> closeBrackets = List.of(')', ']', '}');


        // Converting a string to an array of characters
        char[] chars = s.toCharArray();

        // We go through each character in the array
        for (char ch : chars) {
            // If the character is an opening parenthesis, add it to the stack
            if (openBrackets.contains(ch)) {
                stack.push(ch);
            }

            // If the character is a closing parenthesis, check if there is a corresponding opening parenthesis.
            if (closeBrackets.contains(ch)) {
                if (!stack.isEmpty()) {
                    char peek = stack.peek();
                    if ((ch == ')' && peek == '(') ||
                            (ch == ']' && peek == '[') ||
                            (ch == '}' && peek == '{')) {
                        stack.pop();
                    } else {
                        result = false;
                        break;
                    }
                } else {
                    result = false;
                    break;
                }
            }
        }

        // Checking if the opening brackets are still on the stack.
        if(!stack.isEmpty()) {result = false;}

        return result;
    }
}

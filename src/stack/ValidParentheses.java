package stack;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 */

public class ValidParentheses {
    public static void main(String[] args) {
        boolean valid = new ValidParentheses().isValid("[]{}");
        System.out.println(valid);
    }

    public boolean isValid(String s) {
        Stack<Character> leftBracket = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                leftBracket.push(ch);
            } else {
                if (leftBracket.size() == 0)
                    return false;

                switch (ch){
                    case ')' :
                        if (leftBracket.pop() != '(')
                            return false;
                        break;
                    case ']' :
                        if (leftBracket.pop() != '[')
                            return false;
                        break;
                    case '}' :
                        if (leftBracket.pop() != '{')
                            return false;
                        break;
                }
            }
        }
        return leftBracket.size() == 0;
    }
}

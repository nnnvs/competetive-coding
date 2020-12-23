package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c =  s.charAt(i);

            if(!stack.isEmpty()){
                Character peek = stack.peek();
                if(peek=='[' && c==']'){
                    stack.pop();
                } else if(peek=='(' && c==')'){
                    stack.pop();
                } else if(peek=='{' && c=='}'){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        return (stack.isEmpty()) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([)]"));


    }
}

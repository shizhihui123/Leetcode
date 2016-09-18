package problem20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        int index = 0;
        char[] strs ;
        strs = s.toCharArray();
        Stack<Character> stack = new Stack();

        int length = strs.length;

        while(index < length){
            char ch =  strs[index++];
            if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.empty())
                    return false;
                switch(ch){
                    case ')':
                        if(stack.peek() == '(')
                            stack.pop();
                        else
                            stack.push(ch);
                        break;
                    case '}':
                        if(stack.peek() == '{')
                            stack.pop();
                        else
                            stack.push(ch);
                        break;
                    case ']':
                        if(stack.peek() == '[')
                            stack.pop();
                        else
                            stack.push(ch);
                        break;
                }
            }else
                stack.push(ch);
        }
        if(stack.empty())
            return true;
        return false;
    }

}
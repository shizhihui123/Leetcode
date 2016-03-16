package problem32;

import java.util.Stack;

/**
 * Created by c0de8ug on 16-3-16.
 */
public class Solution {
    public static int longestValidParentheses(String s) {
        Stack stack = new Stack();

        char[] arrays = s.toCharArray();
        int index = 0;
        int num = 0;
        int max = 0;
        int length = arrays.length;

        while(index < length){
            if(arrays[index] == ')'){
                index++;
                if(!stack.isEmpty() && (char)stack.pop() == '(' ){
                    num++;
                    if(num > max){
                        max = num;
                    }
                }
                else
                    num = 0;
            }
            else{
                stack.push(arrays[index++]);
            }
        }
        return max * 2;
    }
}
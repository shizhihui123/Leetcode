package problem32;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by c0de8ug on 16-3-16.
 */
public class Solution {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack();

        char[] arrays = s.toCharArray();
        int index = 0;
        int num = 0;
        int max = 0;
        int length = arrays.length;
        boolean[] mark = new boolean[length];

        while (index < length) {
            if (arrays[index] == ')') {
                if (!stack.isEmpty()) {
                    mark[index] = true;
                    mark[stack.pop()] = true;
                }
                index++;
            } else {
                stack.push(index++);
            }
        }

        for (int i = 0; i < length; i++) {
            if (mark[i] == true) {
                num++;
                if (num > max)
                    max = num;
            } else
                num = 0;
        }

        return max;
    }

    public static void main(String args[]) {
        String str = "";
        int ret = longestValidParentheses(str);
        System.out.println(ret);
    }
}

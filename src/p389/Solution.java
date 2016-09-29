package p389;

import java.util.Stack;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class Solution {
    public static void main(String args[]) {
        String a = "fabcd";
        String b = "fffffffffffffffffffffffffffsdasfadsfdasfdsfdasfdasfdfagdfgdfgdfsgdfgdfshfshrwgrfvdfbggfshgfshdfsgrewffewfdgdfsgregrqefdaefqewrfewfeabfffgddddddddddddddddddddddddddddddddasdsadcd";
        System.out.println(findTheDifference(a, b));
    }

    public static char findTheDifference(String s, String t) {
        Stack<Character> stack = new Stack();
        int sLength = s.length();
        int j = 0;
        int i = 0;
        while (i < sLength) {
            char c = t.charAt(j);
            if (s.charAt(i) == c) {
                i++;
            } else {
                stack.push(c);
            }
            j++;
        }
        int tLength = t.length();
        while (j < tLength) {

            stack.push(t.charAt(j));
            j++;
        }
        return stack.pop();
    }
}

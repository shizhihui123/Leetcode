package p389;

import java.util.Stack;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class SolutionUsingMinus {
    public static void main(String args[]) {

    }

    public static char findTheDifference(String s, String t) {
        int n1 = 0;
        int n2 = 0;

        int sLength = s.length();
        int tLength = t.length();

        for (int i = 0; i < sLength; i++) {
            n1 += s.charAt(i);
        }

        for (int i = 0; i < tLength; i++) {
            n2 += t.charAt(i);
        }

        return (char)(n2 - n1);
    }
}

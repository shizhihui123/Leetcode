package problem344;

public class Solution {

    public static void main(String args[]) {
        String input = "hello";
        System.out.println(reverseString(input));
    }

    public static String reverseString(String s) {
        int length = s.length();
        char[] str = new char[length];
        for (int i = 0; i < length; i++) {
            str[i] = s.charAt(length - i - 1);
        }
        //can't use str.toString()
        return new String(str);
    }
}
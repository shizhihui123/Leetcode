package p387;

import java.util.HashMap;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class Solution {
    public static void main(String args[]) {
        String test = "loveleetcode";
        firstUniqChar(test);
    }

    public static int firstUniqChar(String s) {

        int[] mark = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap();

        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            Integer temp = map.get(c);
            if (temp == null) {
                map.put(c, i);
            } else {
                mark[i] = 1;
                mark[temp] = 1;
            }
        }
        length = mark.length;
        for (int i = 0; i < length; i++) {
            if (mark[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}

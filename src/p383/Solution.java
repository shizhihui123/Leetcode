package p383;

import java.util.HashMap;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class Solution {

    public static void main(String args[]) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = ransomNote.length();
        for (int i = 0; i < length; i++) {
            map.put(ransomNote.charAt(i), null);
        }


        return true;
    }
}

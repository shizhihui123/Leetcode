package p349;

import java.util.*;

/**
 * Created by huangxiaolong on 2016/9/20.
 */
public class Solution {

    public static void main(String args[]) {
        int[] temp1 = {1, 2, 3, 4, 5, 8, 7, 6, 2, 1};
        int[] temp2 = {1, 3, 0, 400, 2, 2, 2};
        System.out.println(Arrays.toString(intersection(temp1, temp2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int length = nums1.length;
        for (int i = 0; i < length; i++) {
            map.put(nums1[i], 1);
        }
        length = nums2.length;
        Set<Integer> set = new HashSet();
        int j = 0;
        for (int i = 0; i < length; i++) {
            Integer temp = nums2[i];
            if (map.get(temp) != null) {
                set.add(temp);
                j++;
            }
        }

        length = set.size();
        Object[] array = set.toArray();
        int[] ret = new int[length];
        for (int i = 0; i < length; i++) {
            ret[i] = (int) array[i];
        }
        return ret;
    }
}
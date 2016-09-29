package p169;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class Solution {

    public static void main(String args[]) {
        int[] a = {2, 2};
        majorityElement(a);

    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int num = nums[i];
            Integer temp = map.get(num);
            if (temp != null) {
                temp++;
                map.put(num, temp);
            } else {
                map.put(num, 1);
            }
        }

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        int compare = length / 2;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = (Map.Entry) iterator.next();
            if (entry.getValue() > compare)
                return entry.getKey();
        }
        return 0;
    }
}

package p217;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangxiaolong on 2016/9/29.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap();

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (map.get(num) == null) {
                map.put(num, 0);
            } else {
                return true;
            }
        }
        return false;
    }

}

package p283;

/**
 * Created by huangxiaolong on 2016/9/20.
 */
public class Solution {

    public static void main(String args[]) {
        int[] nums = {0, 1, 2};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        int length = nums.length;

        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            int elem = nums[i];
            if (elem != 0) {
                temp[index] = elem;
                index++;
            }
        }

        for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
    }
}
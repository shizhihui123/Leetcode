package p283;

import java.util.Arrays;

/**
 * Created by huangxiaolong on 2016/9/21.
 */
public class NoMemCopySolution {

    public static void main(String args[]){
        int[] zeroArray = {0,1,2,4,0,1,4,4,5,0,0,0,1};
        moveZeroes(zeroArray);
        System.out.println(Arrays.toString(zeroArray));
    }

    public static void moveZeroes(int[] nums) {

        int length = nums.length;
        int zeroNum = 0;
        for (int i = 0; i <length ; i++) {
            if(nums[i] != 0){
                for(int j = i;j < length;j++){
                    nums[j - zeroNum] = nums[j];
                    if(j + 1 < length && nums[j + 1] == 0){
                        i = j;
                        break;
                    }
                }
                for (; zeroNum > 0; zeroNum--) {
                    nums[i] = 0;
                    i--;
                }
            }else{
                zeroNum++;
            }
        }
    }

}

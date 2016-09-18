package problem136;

/**
 * Created by huangxiaolong on 2016/9/18.
 */
public class XORSolotion {

  public static void main(String args[]) {
    int[] testCase = {7, 7, 100, 8, 8, 9, 9, 10, 11, 10, 11};

    System.out.println(singleNumber(testCase));

  }


  public static int singleNumber(int[] nums) {
    int ret = 0;
    int length = nums.length;
    for (int i = 0; i < length ; i++) {
        ret ^= nums[i];
    }
    return ret;
  }
}

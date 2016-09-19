package problem371;

/**
 * Created by huangxiaolong on 2016/9/19.
 */
public class Solution {
  public static void main(String args[]) {
    System.out.println(getSum(-1, 1));
  }

  public static int getSum(int a, int b) {

    int temp1 = a ^ b;
    int temp2 = a & b;
    temp2 = temp2 << 1;
    while ((temp1 & temp2) != 0) {
      int temp3 = temp1;
      temp1 = temp1 ^ temp2;
      temp2 = temp2 & temp3;
      temp2 = temp2 << 1;
    }
    return temp1 | temp2;
  }
}
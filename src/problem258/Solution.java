package problem258;

/**
 * Created by huangxiaolong on 2016/9/19.
 */
public class Solution {

  public static void main(String args[]) {
    System.out.println(addDigits(38));

  }

  public static int addDigits(int num) {

    while (num / 10 > 0) {
      int temp = num;
      num = 0;
      while (temp / 10 > 0) {
        num += temp % 10;
        temp /= 10;
      }
      num += temp;
    }
    return num;
  }
}

package p342;

public class Solution {
    public boolean isPowerOfFour(int num) {
        long temp = 1;

        while (temp < 2147483647) {
            if (temp == num) {
                return true;
            }
            temp = temp << 2;
        }
        return false;
    }
}
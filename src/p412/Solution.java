package p412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static String fizz = "Fizz";
    static String buzz = "Buzz";
    static String fizzBuzz = "FizzBuzz";

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();

        for (int i = 1; i <= n; i++) {
            Boolean diveByThree = false;
            Boolean diveByFive = false;
            if (i % 3 == 0) {
                diveByThree = true;
            }
            if (i % 5 == 0) {
                diveByFive = true;
            }
            if (diveByThree && diveByFive) {
                list.add(fizzBuzz);
            } else if (diveByThree) {
                list.add(fizz);
            } else if (diveByFive) {
                list.add(buzz);
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String args[]) {
        fizzBuzz(1);
    }
}
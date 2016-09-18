package problem136;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by codebug on 16-9-18.
 */
public class Solution {


    public static void main(String args[]){
        int[] testCase = {7,7,11,100,7,8,8,9,9,10,11,10,11};

        System.out.println(singleNumber(testCase));

    }



    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int elem = nums[i];
            Integer value = map.get(elem);
            if (value != null){
                value++;
                map.put(elem,value);
            }else{
                map.put(elem,1);
            }
        }
        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        int ret = 0;
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = (Map.Entry) iterator.next();
            if (1 == entry.getValue()){
                ret =  entry.getKey();
                break;
            }
        }
        return ret;
    }

}
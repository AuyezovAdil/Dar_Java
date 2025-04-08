package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapCopy {
    // 13 task
    public static void main(String[] args) {
        HashMap <Integer, Integer> nums = new HashMap<>();
        nums.put(1,1);
        nums.put(2,15);
        nums.put(3,52);
        HashMap <Integer, Integer> numsCopy = new HashMap<>();
        for (Integer i : nums.keySet()) {
            numsCopy.put(i, nums.get(i));
        }
        for (Integer i : numsCopy.keySet()) {
            System.out.println(numsCopy.get(i));
        }

    }
}

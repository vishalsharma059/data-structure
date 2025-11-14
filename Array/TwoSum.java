package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] twoSumUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int anotherNum = target - a;

            if (map.containsKey(anotherNum)) {
                return new int[] { map.get(anotherNum), i };
            }

            map.put(a, i);
        }

        return new int[] {};  
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        int[] ans = twoSumUsingHashMap(nums, 70);

        if (ans.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices: " + ans[0] + ", " + ans[1]);
            System.out.println("Values: " + nums[ans[0]] + ", " + nums[ans[1]]);
        }
    }
}

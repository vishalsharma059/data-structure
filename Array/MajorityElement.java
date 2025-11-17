package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    static int usingHash(int nums[]) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 2, 2, 2, 3, 2, 1, 2 };
        System.out.println(usingHash(nums));
    }
}

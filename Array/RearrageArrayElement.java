package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrageArrayElement {

    static int[] Brute(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = list1.get(a++);
            } else {
                nums[i] = list2.get(b++);
            }
        }
        return nums;
    }

    public static int[] optimalApproach(int[] nums) {
        int pos = 0;
        int neg = 1;
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[pos] = nums[i];
                pos += 2;
            } else {
                result[neg] = nums[i];
                neg += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {3, -2, 1, -5, 2, -4};

        System.out.println("Original: " + Arrays.toString(nums));
        System.out.println("Brute:    " + Arrays.toString(Brute(nums.clone())));
        System.out.println("Optimal:  " + Arrays.toString(optimalApproach(nums)));
    }
}

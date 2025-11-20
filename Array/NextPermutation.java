package Array;

import java.util.Arrays;

public class NextPermutation {

    static void optimalApproach(int[] nums) {
        int index = -1;

        // Step 1: Find the breakpoint
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no breakpoint → reverse whole array
        if (index == -1) {
            reverse(0, nums.length - 1, nums);
            return;
        }

        // Step 3: Find next greater element from right side
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // Step 4: Reverse right part
        reverse(index + 1, nums.length - 1, nums);
    }

    static int[] reverse(int start, int end, int nums[]) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        optimalApproach(nums1);
        System.out.println(Arrays.toString(nums1)); // [1, 3, 2]

        int[] nums2 = {3, 2, 1};
        optimalApproach(nums2);
        System.out.println(Arrays.toString(nums2)); // [1, 2, 3]

        int[] nums3 = {1, 1, 5};
        optimalApproach(nums3);
        System.out.println(Arrays.toString(nums3)); // [1, 5, 1]

        int[] nums4 = {2, 3, 1};
        optimalApproach(nums4);
        System.out.println(Arrays.toString(nums4)); // [3, 1, 2]

        int[] nums5 = {1, 5, 1};
        optimalApproach(nums5);
        System.out.println(Arrays.toString(nums5)); // [5, 1, 1]
    }
}

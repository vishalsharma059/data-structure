package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaxSubArraySumWithKElement {

    public static long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        long currSum = 0, maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right]) || set.size() == k) {
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            currSum += nums[right];

            if (set.size() == k) {
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 5, 4, 2, 9, 9, 9};
        System.out.println("Test 1 Output: " + maximumSubarraySum(nums1, 3)); // Expected: 15

        int[] nums2 = {4, 4, 4};
        System.out.println("Test 2 Output: " + maximumSubarraySum(nums2, 3)); // Expected: 0

        int[] nums3 = {1, 2, 3, 4};
        System.out.println("Test 3 Output: " + maximumSubarraySum(nums3, 2)); // Expected: 7

        int[] nums4 = {2, 6, 7, 3, 1, 5};
        System.out.println("Test 4 Output: " + maximumSubarraySum(nums4, 3)); // Expected: 16

        int[] nums5 = {1, 1, 1, 1};
        System.out.println("Test 5 Output: " + maximumSubarraySum(nums5, 1)); // Expected: 1

        int[] nums6 = {};
        System.out.println("Test 6 Output: " + maximumSubarraySum(nums6, 2)); // Expected: 0 (empty)
    }
}

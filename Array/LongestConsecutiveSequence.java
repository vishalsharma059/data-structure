package Array;

import java.util.*;

public class LongestConsecutiveSequence {

    static int bruteForce(int nums[]) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int largest = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue; 
            }

            if (nums[i] + 1 == nums[i + 1]) {
                count++;
            } else {
                largest = Math.max(largest, count);
                count = 1;
            }
        }

        return Math.max(largest, count);
    }

    static int optimalApproach(int nums[]) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;

        for (int num : set) {

            // num is start of a sequence
            if (!set.contains(num - 1)) {

                int currNum = num;
                int count = 1;

                // expand forward
                while (set.contains(currNum + 1)) {
                    currNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        int[] arr1 = {100, 4, 200, 1, 3, 2};

        System.out.println("Brute: " + bruteForce(arr1.clone()));    
        System.out.println("Optimal: " + optimalApproach(arr1.clone()));

        int[] arr2 = {1, 2, 0, 1};
        System.out.println("Brute: " + bruteForce(arr2.clone()));   
        System.out.println("Optimal: " + optimalApproach(arr2.clone())); 
    }
}

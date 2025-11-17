package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    // Method 1: Using HashMap
    static int usingHash(int nums[]) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    // Method 2: Using Boyer-Moore Voting Algorithm (Optimal)
    static int usingBoyerMooreAlgorithm(int nums[]) {
        int element = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 2, 2, 2, 3, 2, 1, 2 };

        // Test HashMap method
        System.out.println("Using HashMap: " + usingHash(nums));

        // Test Boyer-Moore method
        System.out.println("Using Boyer-Moore: " + usingBoyerMooreAlgorithm(nums));
    }
}

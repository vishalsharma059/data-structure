package Array;

public class MaxSumSubArray {

    // Brute Force O(n^2)
    static int findSum(int nums[]) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int totalSum = 0;
            for (int j = i; j < nums.length; j++) {
                totalSum += nums[j];
                if (result < totalSum) {
                    result = totalSum;
                }
            }
        }
        return result;
    }

    // Kadane's Algorithm O(n)
    static int kadaneAlgotithm(int nums[]) {
        int result = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > result) {
                result = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println("Brute Force Sum: " + findSum(nums));
        System.out.println("Kadane's Algorithm Sum: " + kadaneAlgotithm(nums));
    }
}

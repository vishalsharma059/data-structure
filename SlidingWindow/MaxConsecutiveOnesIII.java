package SlidingWindow;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int left = 0, zerosCount = 0, result = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerosCount++;
            }
            if (zerosCount > k) {
                while (zerosCount > k) {
                    if (nums[left] == 0)
                        zerosCount--;
                    left++;
                }

            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        System.out.println(longestOnes(nums1, 3));
    }
}

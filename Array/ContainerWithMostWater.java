package Array;

public class ContainerWithMostWater {

    static int bruteForce(int[] height) {

        int result = 1;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int currHeight = Math.min(height[i], height[j]);
                int currArea = width * currHeight;
                result = Math.max(result, currArea);
            }
        }
        return result;
    }

    static int twoPointer(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        int result = 1;

        while (start < end) {
            int width = end - start;
            int currheight = Math.min(nums[start], nums[end]);
            result = Math.max(result, width * currheight);
            if (nums[start] < nums[end]) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1,8,6,2,5,4,8,3,7};
        System.out.println("Brute Test 1: " + bruteForce(nums1));   // 49
        System.out.println("TwoPtr Test 1: " + twoPointer(nums1)); // 49
        
        int[] nums2 = {1,1};
        System.out.println("Brute Test 2: " + bruteForce(nums2));   // 1
        System.out.println("TwoPtr Test 2: " + twoPointer(nums2)); // 1
        
        int[] nums3 = {4,3,2,1,4};
        System.out.println("Brute Test 3: " + bruteForce(nums3));   // 16
        System.out.println("TwoPtr Test 3: " + twoPointer(nums3)); // 16
        
        int[] nums4 = {1,2,1};
        System.out.println("Brute Test 4: " + bruteForce(nums4));   // 2
        System.out.println("TwoPtr Test 4: " + twoPointer(nums4)); // 2
        
        int[] nums5 = {5};
        System.out.println("Brute Test 5: " + bruteForce(nums5));   // 1 (as per your rule)
        System.out.println("TwoPtr Test 5: " + twoPointer(nums5)); // 1 (same)
    }
}

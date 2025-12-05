package PrefixSum;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0, currSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }   
        for(int i = 0 ; i < nums.length; i++){
            if(currSum == totalSum - currSum - nums[i]){
                return i;
            }
            currSum += nums[i];
        }
        return -1;    
    }

    public static void main(String[] args) {
        FindPivotIndex obj = new FindPivotIndex();

        int[] nums1 = {1,7,3,6,5,6};
        System.out.println("Pivot of nums1: " + obj.pivotIndex(nums1)); // Expected: 3

        int[] nums2 = {1,2,3};
        System.out.println("Pivot of nums2: " + obj.pivotIndex(nums2)); // Expected: -1

        int[] nums3 = {2,1,-1};
        System.out.println("Pivot of nums3: " + obj.pivotIndex(nums3)); // Expected: 0

        int[] nums4 = {0,0,0,0,0};
        System.out.println("Pivot of nums4: " + obj.pivotIndex(nums4)); // Expected: 0

        int[] nums5 = {-1,-1,-1,0,1,1};
        System.out.println("Pivot of nums5: " + obj.pivotIndex(nums5)); // Expected: 0

        int[] nums6 = {1};
        System.out.println("Pivot of nums6: " + obj.pivotIndex(nums6)); // Expected: 0
    } 
}

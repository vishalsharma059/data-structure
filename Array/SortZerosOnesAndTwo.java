package Array;

import java.util.Arrays;


public class SortZerosOnesAndTwo {
    
    // optimal approach
    static void sortArray(int nums[]) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else {  
                swap(nums, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

public void sortColors(int[] nums) {
        int countZeroes = 0, countOnes = 0, countTwo = 0;;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZeroes++;
            } else if(nums[i] == 1){
                countOnes++;
            } else {
                countTwo++;
            } 
        }
        int count = 0;
        for(int i = 0; i < countZeroes; i++){
            nums[count++] = 0;
        }
        for(int i = 0; i < countOnes; i++){
            nums[count++] = 1;
        }
        for(int i = 0; i < countTwo; i++){
            nums[count++] = 2;
        }   
    }

    

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 1, 2, 1, 2, 2, 1, 0 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        sortArray(arr);

        System.out.println("After Sorting : " + Arrays.toString(arr));
    }
}

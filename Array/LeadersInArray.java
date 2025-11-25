package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    static List<Integer> find(int nums[]) {
        int n = nums.length;
        int maxRight = nums[n - 1];

        List<Integer> list = new ArrayList<>();

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= maxRight) {
                maxRight = nums[i];
                list.add(nums[i]);
            }
        }

        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {

        int nums[] = {16, 17, 4, 3, 5, 2};
        System.out.println(find(nums)); 
    }
}


package Array;

public class BuyAndSellStrock {

    static int maxProfit(int[] prices) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (result < profit) {
                    result = profit;
                }
            }
        }
        if (result < 0)
            return 0;
        return result;
    }

    static int optimalApproach(int nums[]) {
        int min = nums[0];
        int profit = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] - min > profit) {
                profit = nums[i] - min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Brute Force Profit: " + maxProfit(prices));
        System.out.println("Optimal Approach Profit: " + optimalApproach(prices));
    }
}

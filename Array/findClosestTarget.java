package Array;

import java.util.Scanner;

public class findClosestTarget {

    static void find(int arr[], int n, int target) {
        int num1 = 0, num2 = 0;
        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];

                int diff;
                if (sum > target)
                    diff = sum - target;
                else
                    diff = target - sum;

                if (mindiff > diff) {
                    mindiff = diff;
                    num1 = arr[i];
                    num2 = arr[j];
                }

            }

        }
        System.out.println("Closest pair are: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element for arr" + i + " :");
            arr[i] = sc.nextInt();
        }
        find(arr, n, target);
    }
}

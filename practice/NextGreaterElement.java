package Practice;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    static boolean isArmstrong(int num) {
        int count = 0;
        int temp = num;

        // Counting digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int temp2 = num;
        int sum = 0;

        while (temp2 != 0) {
            int n = temp2 % 10;
            temp2 = temp2 / 10;

            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power * n;
            }

            sum = sum + power;
        }

        return sum == num;
    }

    static void fibonacciTriangle(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println("");
        }
    }

    static boolean palindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    static String reverseWord(String s) {
        String[] words = s.trim().split("//s+");
        int start = 0, end = words.length - 1;
        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join("", words);
    }

    static int secondLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                secondLargest = largest;
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    static void reverse(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rightRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        int start = 0;

        reverse(arr, start, n - 1);
        reverse(arr, start, k - 1);
        reverse(arr, k, n - 1);
    }

    static void strongestNeighbour(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i + 1] + " ");
            }
        }
    }

    static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array!!");
        // int n = sc.nextInt();
        // int []arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the arr" + i + " :");
        // arr[i] = sc.nextInt();
        // }

        // strongestNeighbour(arr);
        System.out.println(isArmstrong(153));
        fibonacciTriangle(5);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rightRotate(arr, 3);
        printArr(arr);
    }
}

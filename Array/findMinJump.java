package Array;

public class FindMinJump {
    static int findMin(int arr[], int n) {
        int count = 0, result = 0;

        while (count < n) {
            count = count + arr[count];
            result++;
        }
        return result-1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 1, 5 };
        System.out.println(findMin(arr, 5));
    }
}

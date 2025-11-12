package pattern;

import java.util.Scanner;

public class FactorisationPattern {

    static int findFactorisation(int n) {
        int temp = 2;
        while (temp < n) {
            if (n % temp == 0) {
                return temp;
            }
            temp++;
        }
        return n;
    }

    static void pattern(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(findFactorisation(count) + " ");
                count++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        pattern(n);

    }
}

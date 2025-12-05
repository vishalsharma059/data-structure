package Pattern;

public class Pattern5 {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int num;
                if (j%2 == 1) {
                     num = 1;
                } else {
                     num = 0;
                }
                System.out.print(num+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }
}

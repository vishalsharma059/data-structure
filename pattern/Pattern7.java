package pattern;

public class Pattern7 {
    static void pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = n - i + 1;
            int spaces = (2*i) - 2;
            if(i > n){
                stars = i + 1 - n;
                spaces = 2 * (2 * n - i - 1);
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }
}

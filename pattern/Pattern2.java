package Pattern;

public class Pattern2 {
    static void pattern(int n){
        for (int rows = n; rows >= 0; rows--) {
            int spaces = n - rows;
            int stars = 2 * rows - 1;

            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}

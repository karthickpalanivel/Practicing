import java.util.*;

public class pattern_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern_4(n);

    }
    
    public static void pattern_4(int n) {

        
        for (int i = 0; i < 2 * n - 1; i++) {
            int spaces = n - i;
            int totalCols = i > n ? 2 * n - i : i;
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    
    public static void pattern_1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void pattern_2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
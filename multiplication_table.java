import java.util.*;

public class multiplication_table {
    public static void main(String args[]) {
        long n, limit;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the multiplication table: ");
        n = sc.nextLong();        
        System.out.println("Enter the limit for the multiplication table: ");
        limit = sc.nextLong();
        for (int i = 1; i <= limit; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }    
}

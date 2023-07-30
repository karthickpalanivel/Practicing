import java.util.*;

public class perfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        
        if (sum == n) {
            System.out.println(sum + " is a perfect Number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }
}


/*user input
 * looping and modulus 
 * sum the number 
 * print if perfect
 */
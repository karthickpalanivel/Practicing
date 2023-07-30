import java.util.*;

public class SumOfPrimeNonPrime {
    public static void main(String args[]) {
        int n, i, j, num, sum = 0, sum1 = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the element of array ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            num = a[i];
            int f = 0;
            for (j = 2; j < num; j++) {
                if (num % j == 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                sum += a[i]; // sum of non-prime number
            } else {
                sum1 += a[i]; // sum of prime number
            }
        }
        System.out.println("The sum of prime number: " + sum);
        System.out.println("The sum of Non-Prime Number: " + sum1);
    }
}

import java.util.*;
import java.io.*;

public class SumOfArray {
    public static void main(String args[]) {
        int n, r, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            num = a[i];
            while (num > 0) {
                r = num % 10;
                sum = sum + r;
                num = num / 10;
            }
        }
        System.out.println("Sum of the array element: "+sum);
    }
}
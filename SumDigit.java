import java.util.*;
import java.io.*;

public class SumDigit {
    public static void main(String args[]) {
        int a, i, b, c, temp, sum =0, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            arr[n] = sc.nextInt();
        }
        
        for (i = 0; i < n; i++) {
            for (int j = 0; j < arr[i]; j++)
            System.out.println(arr[i]);
            sum = sum + (arr[i]%10);
        }
    }
}
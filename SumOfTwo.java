 import java.io.*;
import java.util.*;

public class SumOfTwo{
    public static void main(String args[]){
        int n, m, i, j, k, temp, a=0, target, num;
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();
        int arr_1[] = new int[n];
        int arr_2[] = new int[m];
        
        for (i = 0; i < n; i++) {
            arr_1[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.print(arr_1[i]);
        }
        
        for (j = 0; j < n; i++) {
            for (k = 0; k < num; k++)
                temp = arr_1[i] + arr_1[j];
            if (temp == target) {
                arr_2[a] = temp;
                a++;
            }
        }
        
        System.out.println("Output: ");
        for (int z = 0; z <= a - 1; z++) {
            System.out.println()
        }

    }
}
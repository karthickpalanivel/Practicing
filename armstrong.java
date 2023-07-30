import java.util.*;
import java.io.*;

public class armstrong {
    public static void main(String args[]) {
        int d1, d2, d3;
        int temp, result;
        int count = 0;
        for (int number = 100; number <= 999; number++) {
            temp = number;
            d3 = temp % 10;
            temp = temp / 10;

            d2 = temp % 10;
            temp = temp / 10;

            d1 = temp % 10;
            temp = temp / 10;

            result = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);

            if (result == number) {
                count++;
                System.out.println("\n"+number + " This an armstrong number");

            }        
        }
        System.out.println("\nThere are totally "+count+" armstrong numbers"); 
    }
}
            
            
       // int num, rem, target;
// int reverse = 0;
// Scanner sc = new Scanner(System.in);
// System.out.println("The 3 digits armstrong number are: ");
// for (int i = 100; i < 1000; i++) {
// num = i;
// target = num;
// while (num != 0) {
// rem = num % 10;
// reverse = reverse + (rem * rem * rem);
// num = num / 10;
// }

// if (reverse == target)
// System.out.println(reverse + " is an armstrong number");
// } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for(int i=100;i<=999;i++)
        //     if (isArmstrong(n)) {
        //         System.out.println(i + "\t");
        // }
    // }

    // static boolean isArmstrong(int a) {
    //     int original = a;
    //     int sum = 0;
    //     if (a <= 1) {
    //         return false;
    //     }
    //     while (a > 0) {
    //         int rem = a % 10;
    //         a = a / 10;
    //         int cube = rem * rem * rem;
    //         sum = sum + cube;
    //     }

    //     if (sum == original)
    //         return true;

    //     return false;
    // }

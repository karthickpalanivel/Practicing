import java.util.*;
import java.io.*;

public class SumOfArray_1 {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] nums;
        nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            sum = sum + nums[i];
            System.out.print(sum);
        }
    }
}
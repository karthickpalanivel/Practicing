import java.io.*;
import java.util.*;

public class OddEven {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: \n");
        n = sc.nextInt();
        OddEven g = new OddEven();
        g.cal(n);
        // USING METHODS LETS TRY
    }

    public void cal(int a) {
        if (a % 2 == 0)
            System.out.println("The number is not ODD");
        else
            System.out.println("The number is not EVEN");
    }
}

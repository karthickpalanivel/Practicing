import java.util.*;

public class factorial {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int i = fact(n);
        System.out.println("The factorial is " + i);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * fact(n - 1);
    }
}



/*  EXPLAINATION OF THE PROGRAM
 *  return 5 * fact(4)
 *  return 5 * 4* fact(3)
 *  return 5 * 4* 3* fact(2)
 *  return 5 * 4* 3* 2* fact(1)
 *  return 5 * 4* 3* 2* 1* fact(0)
 *  return 5 * 4* 3* 2* 1 -> function exits
 */
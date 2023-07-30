import java.io.*;
import java.util.*;

public class GreatestInGroup {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Enter Four Numbers: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if (a > b && a > c && a > d) {
            System.out.println("the greatest Number: " + a);
        } else if (b > c && b > d) {
            System.out.println("the greatest Number: " + b);
        } else if (c > d) {
            System.out.println("the greatest Number; " + c);
        } else {
            System.out.println("the greatest Number: " + d);
        }
        // GreatestInGroup a = new GreatestInGroup();
        // a.greatest();
    }
}

// public void greatest(int i, j, k, l) {
// if (i > j && i > k && i > l) {

// }

// }
import java.util.*;
import java.io.*;
public class NestedIf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter Four Numbers: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a > b) {
            if (a > c) {
                System.out.println("Greatest Number is:" + a + "(A)");
            } else {

                System.out.println("Greatest Number is:" + c + "(C)");
            }
        }
        else {
            
            System.out.println("Greatest Number is:" + b + "(B)");
        }
    }
}

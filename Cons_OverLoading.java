import java.util.*;
import java.io.*;

class cons {
    
    public cons(int a1, int b1) {
        int a = a1;
        int b = b1;
    }

    public int cal() {
        cons();
        int c = a + b;
        return c;
    }
}

public class Cons_OverLoading {
    public static void main(String args[]) {
        int a1, b1, c;
        Scanner sc = new Scanner(System.in);
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        
        cons c1 = new cons(a1,b1);
        int sum = c1.cal();
        System.out.println("Sum = " + sum);
        System.out.println("Enter two Number: ");
        

    }    
}

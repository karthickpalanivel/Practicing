import java.util.*;
// calling a method inside another when both methods are in same class, this kind functioning technique is called as nested function

class demo {
    private int m, n, o;

    demo(int x, int y, int z) {
        m = x;
        n = y;
        o = z;
    }

    int largest() {
        if (m > n && m > o)
            return m;
        else if (n > o)
            return n;
        else
            return o;
    }

    void display() {
        int large = largest();
        System.out.println("The largest number: " + large);
    }
}


public class NestedMethod {
    public static void main(String args[]) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        demo in = new demo(x, y, z);
        in.display();
    }
}
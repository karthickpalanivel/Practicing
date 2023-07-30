import java.util.*;
import java.io.*;

public class SwitchCondition2 {
    public static void main(String args[])
    {
        int x = 55, y = 12;
        int z = fun(x, y);
        System.out.println(z);
    }

    public static int fun(int a, int b) {
        if (a == 0 || b == 0) {
            return a;
        }
        if (b % 2 == 0) {
            fun(a / 2, a / 3);
            System.out.println("a = "+a+" b = "+b);
        }
        return fun(a + 1, b - 1);
    }
}
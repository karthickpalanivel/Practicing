import java.util.*;

class poly {
    public void add() {

        int a = 10, b = 20;
        int c = a + b;
        System.out.println("Sum " + c);
    }
}
class poly1
{
    public void add(int a,int b)
    {
        int c = a + b;
        System.out.println("Sum " + c);
    }
}

public class overloading{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        poly o = new poly();
        poly1 o1 = new poly1();
        o1.add(x, y);
        o.add();
        sc.close();
    }
}
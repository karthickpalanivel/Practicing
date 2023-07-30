import java.util.*;

class box {
    float length, breadth;

    public box() {
        System.out.println("This is a kind of constructor");
    }

    public box(float x, float y) {
        length = x;
        breadth = y;
    }

    public box(float a) {
        System.out.println("The area of square: " + (a * a));
    }
    float area() {
        return length * breadth;
    }
}
public class constructor_joe {
    public static void main(String args[]) {

        box o = new box();
        System.out.println("Area = " + o.area());
        float length, breadth;
        Scanner sc = new Scanner(System.in);
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        box o1 = new box(length, breadth);

        box o2 = new box(19);
    }
    
}

import java.util.*;

class rect {
    int length, width;

    void getDetails(int x, int y) {
        length = x;
        width = y;
    }

    int area() {
        return length * width;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        rect r = new rect();
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // r.getDetails(x, y);
        r.length = 55;
        r.width = 20;
        // r.getDetails(x, y);
        System.out.println(r.area());
        // sc.close();        
    }
}

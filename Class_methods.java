import java.util.*;

public class Class_methods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        rectangle rect = new rectangle();
        System.out.print("Enter the length of the rectangle: ");
        rect.length = sc.nextInt();
        System.out.print("Enter the width of the rectanlge: ");
        rect.width = sc.nextInt();
        
        if (rect.length == rect.width) {
            System.out.println("length and width are equal so, it is not a rectangle. it is kind of square ");
            System.out.println("The area of the square = " + rect.area());
        }
        else {
            System.out.println("The Area of the rectangle = " + rect.area());
        }

    }
}

class rectangle {
    int length, width;

    void getdetails(int x, int y) {
        length = x;
        width = y;
    }

    int area() {
        int a = length * width;
        return a;
    }
}

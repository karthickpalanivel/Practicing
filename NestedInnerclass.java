/* use class inside another class
    you can call the inner class by creating an object that statically links outer and inner class
*/ 
class outer {
    int a = 50;

    class inner {
        int b = 58;

        void display() {
            System.out.println("A: " + a);
            System.out.println("B: " + b);
        }
    }

    void outerDisplay() {
        inner i = new inner();
        i.display();
        System.out.println(i.b);
    }
}

public class NestedInnerclass {
    public static void main(String args[]) {
        outer o = new outer();
        outer.inner i = new outer().new inner();
        i.display();
        o.outerDisplay();
    }
}

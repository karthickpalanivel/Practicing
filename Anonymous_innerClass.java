abstract class testDemo {
    abstract void display();
    //we can't create object instance for abstract class
    //but we can overwrite the interface of the instance
    // we can use this anonymous inner class use in both interface and abstract class 
}

class outerDemo {
    public void outerDisplay() {
        testDemo o = new testDemo() {
            void display() {
                System.out.println("Test Display");
            }
        };
        o.display();
    }
}

public class Anonymous_innerClass {
    public static void main(String args[]) {
        outerDemo o = new outerDemo();
        o.outerDisplay();
    }
}
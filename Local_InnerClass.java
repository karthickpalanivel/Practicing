class outercls {
    void display() {
        class inner {
            void innerDisplay() {
                System.out.println("inner display");
            }
        }
        inner i = new inner();
        i.innerDisplay(); //calling the class within the outer class is known as local inner class
    }
}

public class Local_InnerClass {
    public static void main(String args[]){
        outercls o = new outercls();
        o.display();
    }
}

// static varibles and static methods
class staticTest {
    static int a = 10;
    int b = 20;

    // A normal void function can use both normal and static variables. 
    void show() {
        System.out.println("A : " + a + "\nB : " + b);
    }

    // A static methods can use only static variables
    static void display() {
        System.out.println("Static varibles A : " + a);
    }
}



public class SVSM {
    public static void main(String args[]) {
        staticTest st = new staticTest();
        staticTest st2 = new staticTest();
        st.show();
        st2.b = 100;
        st2.show();
        staticTest.a = 900;
        st.show();
        st2.show();
        st.display();
        //static variables has common instance.  
    }
}
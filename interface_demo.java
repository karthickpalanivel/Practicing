interface interdemo {

    // function that are declared in interface are defaulted public abstract method functions
    // private method are impossible to use in interface
    // if a variable is used in interface that is a staic variable till the end.
    // you can use static keyword to create function methods in interface.
    void fun1();

    void fun2();

    public static void fun3() {
        System.out.println("I am  method 3");
    }
}

interface interdemo2 extends interdemo {
    void fun4();
}

class TestInter implements interdemo2
{
    
}

public class interface_demo {

}

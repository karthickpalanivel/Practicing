
//using inheritence technique in interfaces with another interface

interface interfaceDemo {
    int A = 25;

    void fun1();

    void fun2();

    static void fun3() {
        System.out.println("This is testing for function 3 in interface");
    }

    private void fun6() {
        System.out.println("fun-6");
    }

    default void fun5() {
        System.out.println("testing function 5\n");
    }

   
}


interface interfaceDemo_ extends interfaceDemo {
    void fun4();
}

class testInter implements interfaceDemo_ {

    @Override
    public void fun1() {
        // TODO Auto-generated method stub
        System.out.println("function 1");
    }

    @Override
    public void fun2() {
        // TODO Auto-generated method stub

        System.out.println("function 2");
    }

    @Override
    public void fun4() {
        // TODO Auto-generated method stub

        System.out.println("function 4");
    }
    
}
//

// using private function in interface can be default void mehods can access private methods

public class interfacemodeDemo {
    public static void main(String args[]) {
        System.out.println("A : " + interfaceDemo.A);
        interfaceDemo.fun3();
        testInter o = new testInter();
        o.fun1();
        o.fun2();
        o.fun4();
        o.fun5();

    }
}
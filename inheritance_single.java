// keyword extends is used to single inheritance 
class father {
    public void house() {
        System.out.print("Have own 2BHK house");
    }
}

class son extends father {
    public void car() {
        System.out.println("\nHave own audi car");
    }
}

public class inheritance_single {
    public static void main(String args[]) {
        son o = new son();
        o.house();
        o.car();
    }
}
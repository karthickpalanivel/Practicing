import java.util.*;

class outer {
    private String name, address;

    String getname() {
        return name;
    }

    String getaddress() {
        return address;
    }

    void setname() {
        String id = name;
    }

    void setaddress() {
        String location = address;
    }

    String[] data() {
        String[] unique = { name, address };

        return unique;

    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        outer obj = new outer();
        obj.getClass();

        sc.close();
    }    
}

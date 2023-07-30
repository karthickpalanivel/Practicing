import java.util.*;
// accessing the more than one class by another is known as mutlilevel inheritance...

class grandfather {
    public void property()
    {
        System.out.println("owned something for his needs");    
    }
    
}

class father extends grandfather {
    public void property1()
    {
        System.out.println("receieved properties of his dad");

    }
}

public class MultiLevel_InHeritance {
    public static void main(String args[]) {
        father o = new father();
        o.property();
        o.property1();
    }    
}

interface Animal {
    void sound();

    void sleep();
}

class dog implements Animal {
    public void sound() {
        System.err.println("\nbarks");
    }

    public void sleep(){
        System.out.println("sleeps 8 hrs a day\n");
    }
}
public class interdemo {
    public static void main(String args[]) {
        dog o = new dog();
        o.sound();
        o.sleep();
    }
}

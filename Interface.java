class inference  Animal{
    void sound();
    void sleep();
}

class dog implements Animal {
    public void sound() {
        System.out.println("Dog sounds: woof...");
    }

    public void sleep() {
        System.out.println("Dog sleep whenever it needs...");
    }
}


public class Interface {
    public static void main(String args[]){
        dog d = new dog();
        

        d.sound();
        d.sleep();
        
    }
}

//Static class will have only static variables...

class outerclass {
    static int x = 10;
    static int y = 20;
    static class innerclass{
        void display(){
            System.out.println("\nX : " + x);
            System.out.println("Y : "+ y+"\n");
        } 
    }
}

public class static_innerClass {
    public static void main(String args[]){
        outerclass.innerclass i = new outerclass.innerclass();
        i.display();
    }
}

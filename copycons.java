import java.util.*;

class complex {
    private int real, img;

    public complex() {
        this.real = 0;
        this.img = 0;
    }

    public complex(int r, int i) {
        this.real = r;
        this.img = i;
    }
    
    public complex(complex o2){
        this.real = o2.real;
        this.img = o2.img;
    }

    public String toString(){
        return "("+real+"+"+img+"i)";
    }
}

public class copycons {
    public static void main(String args[]){
        complex o1 = new complex();
        System.out.println("Object 1: " + o1);
        
        complex o2 = new complex(3,2);
        System.out.println("Object: " + o2);
        
        complex o3 = new complex(o2);
        System.out.println("Object 3: "+ o3);
    }    
}
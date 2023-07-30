import java.util.*;
import java.lang.*;
class user {
    String name;
    int age;

    user(String n, int a){
        this.name = n;
        this.age = a;
    }
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }  
}

class MainProgrammer extends user {
    String companyName;

    MainProgrammer(String n, int a, String c) {
        super(n, a);
        this.companyName = c;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Company Name: " + companyName);
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        MainProgrammer o = new MainProgrammer("karthick", 15, "Third party production");
        o.display();
    }
}

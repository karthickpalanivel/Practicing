import java.util.*;
import java.io.*;
public class returnString {
    
    static String greet(String welcome) {
        System.out.println(welcome);
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        String greeting = "\nWelcome to my world\n";
        System.out.println(greeting);
        String message = "\n\nHi " + name;
        return message; 
    }

    public static void main(String args[]) {
        String welcome = "Well, let me know you name? ";
        String userName = greet(welcome); 
        System.out.println(userName);
        
    }
}

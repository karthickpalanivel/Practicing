import java.io.*;
import java.util.*;

public class SwitchCondition {
    public static void main(String args[])
    {
        String op;
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Which arthimetic operation you want to perform: \n +\t-\t*\t/\n");
        op = sc.nextLine();
        char c = op.charAt(0);
        
        System.out.println("\nEnter the two number: ");
        a = sc.nextInt();
        b = sc.nextInt();

        switch (op) {
            case "+":{
                a+=b;
                System.out.println("The sum of two Numbers: " + a);
                break;
            }
            case "-": {
                a-=b;
                System.out.println("The difference of two Numbers: " + a);
                break;
            }
            case "*":{
                a*=b;
                System.out.println("The Multiplication of two Numbers: "+a);
                break;
            }
            case "/":{
                a/=b;
                System.out.println("The division of two Numbers: "+a);
                break;
            }
        }
    }
}
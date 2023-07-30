import java.util.*;

public class insure {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n'M' for married (or) 'U' for unmarried\nEnter your martial status: ");
        char martial = sc.next().charAt(0);

        if (martial == 'u' || martial == 'U') {
            System.out.println("Enter the Gender M/F: ");
            char gender = sc.next().charAt(0);
            System.out.println("Enter the age: ");
            int age = sc.nextInt();
            if ((gender == 'm' || gender == 'M') && age >= 30) {
                System.out.print("You are Eligible for Insurance...");
            }
            else if((gender == 'f' || gender == 'F') && age >=25 ){
                System.out.println("You are eligible for Insurance");
            }
            else
                System.out.print("You are not eligible for Insurance");
        }
    }
}
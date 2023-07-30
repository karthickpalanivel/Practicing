import java.util.*;

public class Strong_number_joe {
    //The sum of each digit after factorialing it is known as Strong number
    public static void main(String args[]) {
        int num, orginal, fact, rem;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        orginal = num;
        

        while (num > 0) {
            rem = num % 10;
            fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            num = num/ 10;
        }
        if(sum == orginal)  
            System.out.println(orginal + " is a strong number");
        else 
            System.out.println("\n"+orginal+ " is not a strong number");
    }
} 

import java.util.*;
public class sum {
    public static void main(String args[]) {
        int answer = sum();
        System.out.println("The answer is: "+answer);
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int ans = num1 + num2;
        return ans;
    }
}
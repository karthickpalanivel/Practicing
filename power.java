import java.util.*;

public class power {
    public static void main(String[] args) {
        int num, power;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the constatn number: ");
        num = sc.nextInt();
        System.out.println("Enter the power digit: ");
        power = sc.nextInt();
        while (power != 0) {
            num *= num;
            power--;
        }

        System.out.println(num);
    }
}

import java.util.*;

public class greetings {
    static int sum2() {
        System.out.println("Hello everyone\nHow many of you, came today?: ");
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("This is your token number: " + i);
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String args[]) {
        int ans = sum2();
    }
    
}
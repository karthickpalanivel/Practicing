import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("The given Integer   : " + num);
        int result = 0;
        while (true) {
            if (num == 0)
                break;
            
            int temp;
            temp = num % 10;
            result = result * 10 + temp;
            num /= 10;
        }
        
        System.out.println("The reversed Integer: " + result);
        
        sc.close();
    }
    
    // public static int reverse(int num, int result) {
    //     if (num == 0) {
    //         return result;
    //     }
    // int temp;
    // temp = num%10;
    // result = result * 10 + temp;
    // num /= 10;
    // return reverse(num, result);
    // }
}
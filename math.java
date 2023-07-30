import java.util.*;

public class math {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("Power: " + maths.power(a,b2));
        System.out.print("\nEnter a decimal number: ");
        int n = sc.nextInt();
        maths.decimalToBinary(n);
        System.out.print("\nEnter a binary number: ");
        int b = sc.nextInt();
        System.out.println("Binary to decimal binary conversion: "+maths.binaryToDecimal(b));
        

    }
}

class maths {
    public static int power(int a, int b2) {
        int result = 1;
        for (int i = 1; i <= b2; i++) {
            result *= a;
        }
        return result;
    }

    public static void decimalToBinary(int n) {
        System.out.println("Binary no: ");
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0) { // assume value of n 12 = binary value 1100
            binaryNum[i] = n % 2; // separating the remainder values
            n = n / 2;
            i++;
        }
        /*
         * EXPLAINATION FOR ABOVE FUNCTION
         *
         * TRAIL 1
         * REMAINDER STORES = 0 ; N = 6; I = 1
         * REMAINDER STORES = 00 ; N = 3; I = 2
         * REMAINDER STORES = 001 ; N = 1; I = 3
         * REMAINDER STORES = 0011 ; N = 0; I = 4
         */
        for (int j = i - 1; j >= 0; j--) {

            /*
             * J = 3; I = 4; VALUE = 0
             * J = 2; I = 3; VALUE = 0
             * J = 1; I = 2; VALUE = 1
             * J = 0; I = 1; VALUE = 1
             */
            System.out.print(binaryNum[j]);
        }
    }
    
    public static int binaryToDecimal(int b) {
        /*
         * assume BINARY VALUE = 110, DECIMAL = 6
         * 0*2^0 = 0
         * 1*2^1 = 2
         * 2*2^2 = 4
         * 
         * (sum of those results: 0 + 2 + 4 = 6 == decimal)
         */
        
         
        int decimal = 0, remainder, power = 0;
        while (b != 0) {
            remainder = b % 10;
            decimal += remainder * Math.pow(2, power);
            b /= 10;
            power++;
        }
        return decimal;
    }    
}
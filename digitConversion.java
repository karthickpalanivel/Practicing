import java.util.*;
public class digitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Deci2Bin(num);
        Bin2Deci(num);
        sc.close();
    }

    public static void Deci2Bin(int num) {
        int[] binaryNum = new int[num * 10];
        int i = 0;
        while (num > 0) {
            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }

        for (int j = i; j > 0; j--) {
            System.out.println(binaryNum[i]);
        }
    }

    public static int powe(int constant, int power) {
        int num = power;

        while (num != 0) {
            if (power == 0) {
                return constant * 1;
            }
            constant*=constant;
            power--;

        }
        return constant;
    }

    public static void Bin2Deci(int num) {
        int decimal = 0, power = 0;

        while (num != 0) {
            int rem = num % 10;
            decimal += rem * powe(2, power);
            num /= 10;
            power++;
        }
    
        System.out.println("The decimal value: "+decimal);
    }
}
import java.util.*;

public class array_oddEven {
    public static void main(String args[]) {
        int count_odd = 0, count_even = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter arr[" + i + "] number: ");
            arr[i] = sc.nextInt();
        }

        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.println(element + "is a even number");
                count_even++;
            } else {
                System.out.println(element + " is a odd number");
                count_odd++;
            }
        }
        System.out.println("No. of ODD Number: "+ count_odd);
        System.out.println("No. of EVEN number: " + count_even);
    }
}
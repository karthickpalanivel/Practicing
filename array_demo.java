import java.util.*;
public class array_demo {
    /* datatype variable_name[] = new datatype[size]
     *(example) int a[] = new int[]
    */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number of elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("The elements of arrays is");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
    }
}
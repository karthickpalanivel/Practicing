import java.util.*;
public class array_sorting{
    public static void main(String args[]){
        int[] a = new int[]{85, 54, 75, 32, 14};
        System.out.println("\nBefore Sorting "+ Arrays.toString(a));
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting: "+ Arrays.toString(a));
    }
}

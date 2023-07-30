import java.util.*;

public class array_insertion {
    public static void main(String args[]) {
        int[] a = { 10, 20, 30, 40, 50, 60 };
        int index = 2;
        int value = 22;
        System.out.println("\nBefore insertion: " + Arrays.toString(a));

        for (int i = a.length - 1; i > index; i--) {
            a[i - 1] = a[i];
        }
        a[index] = value;
        System.out.println("\nAfter Insertion: " + Arrays.toString(a)+"\n");
    }
}

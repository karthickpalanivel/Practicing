import java.util.*;

public class duplicate_number {
    public static void main(String args) {
        int[] a = { 1, 2, 2, 1, 4, 5, 5, 8, 7, 4, 6, 9, 3, 10 };
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    System.out.println("The duplicate elements: " + i);
                }
            }
        }
    }    
}

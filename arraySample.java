import java.util.*;
public class arraySample {
    public static void main(String args[]) {
        int i;
        int arr[] = {2, 3, 4, -2, -4, 3, 1, -4};
        int size = 8;
        int last = arr[size - 1];
        arr[size - 1] = -1;
        for (i = size - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = last;

            if (last < temp) {
                last = temp;
            }
        }
        
        System.out.println("Array Elements: ");
        
        for (i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
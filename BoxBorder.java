import java.util.*;
public class BoxBorder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter limit of Border: \nNote: Enter only odd numbers");
        int n = sc.nextInt();
        int[][] arr = new int[10][10];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j==n-1) {
                    System.out.print("1 ");
                } 
                else if (i == n/2 && j == n/2){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }    
}


/* 1 1 1 1 1
 * 1 0 0 0 1
 * 1 0 1 0 1
 * 1 0 0 0 1
 * 1 1 1 1 1
 * 
 * the indices of 1 are = row || column == 0 
 */

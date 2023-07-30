import java.util.Scanner;

class layer{
    public static void main(String args[]) {
        Scanner la = new Scanner(System.in);
        int num = la.nextInt();
        int size = (num * 2) - 1, start = 0, end = size - 1;
        int[][] arr = new int[size][size];
        while (num >= 1) {
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i == start || j == start || i == end || j == end) {
                        arr[i][j] = num;
                    }
                }

            }
            start++;
            size--;
            num--;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
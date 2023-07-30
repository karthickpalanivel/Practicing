public class array_enhancedJagged {
    public static void main(String args[]) {
        int a[][]={
            {1,2,3},
            {1,2},
            {1,2,3,4}
        };
        for (int k[] : a) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println("");
        }
    }
}
         
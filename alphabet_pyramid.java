public class alphabet_pyramid {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 0; i < size; i++) {
            // printing spaces
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            // printing alphabets
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }
    }
}


/* iteration - 1
size = 5, 5, 4 
1, A

I - 2
    

 * 
 */
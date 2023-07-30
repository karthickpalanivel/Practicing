public class nestedFor {
    public static void main(String args[]) {
        int p, q, r;
        int result = 11;
        for (p = 1; p <= 2; p++) {
            for (q = 3; q >= p; q--) {
                result--;
                System.out.println(result);
            }
            for (r = 1; r <= p * 2 - 1; r++) {
                result++;
                System.out.println(result);
            }
        }
        System.out.println("Final Result "+ result);
    }
}
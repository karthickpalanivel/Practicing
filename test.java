public class test {
    public static void main(String[] args) {
        factorial(5);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return n * 1;
        }
        else 
            return (n * factorial(n - 1));
    }
}

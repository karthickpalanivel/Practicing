public class WithoutBreak {
    public static void main(String args[]) {
        int num = 11;
        int i = 16;
        while (i > num) {
            switch (num % 9) {
                case 0: {
                    num += 4;
                }
                case 1: {
                    num += 8;
                }
                case 2: {
                    num += 9;
                }
                case 3: {
                    num += 6;
                }
                default: {
                    num /= 10;
                }

            }
            i--;
            System.out.println(num + " " + i);
        }

        System.out.println("The final output: num = " + num + " and  i = " + i);
    }
}

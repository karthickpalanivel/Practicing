import java.util.*;
// program to change the first letter of the word as capital letter
public class capitalize {
    public static void main(String args[]) {
        StringBuilder a = new StringBuilder("karTHICK iS JUST aN oRDINARY bOY");
        System.out.println(a);

        // first lets change the first letter of the character as capital letter.

        if (a.charAt(0) >= 97 && a.charAt(0) <= 122) {
            int b = (int) a.charAt(0) - 32;
            a.setCharAt(0, (char) b);
        }
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == 32) {
                i++;
                {
                    if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                        int b = (int) a.charAt(i) - 32;
                        a.setCharAt(i, (char) b);
                    }
                }
            } else {
                if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                    int b = (int) a.charAt(i) + 32;
                    a.setCharAt(i, (char) b);
                }
            }
        }
        System.out.println("Converted Stirng: "+a);
    }
}

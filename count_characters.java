

/* 
   65 - 90 Uppercase
   97 - 122 Lowercase
   32 - space
   48 - 57 numbers
        5 uppercase
        35 lowercase
        3 numbers
        5 symbols
        7 spaces

 */
//program to count uppercase, lowercase, space, number, vowels and symbols in a string...
public class count_characters {
    public static void main(String args[]) {
        int upper =0, lower=0 , space=0, number=0, vowels=0, symbols=0;
        StringBuilder a = new StringBuilder("Kosu Adichathuku Ellam Suspend Pannamattanga 123 @@ #$$");
        System.out.println(a);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                upper++;
            } else if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                lower++;
            } else if (a.charAt(i) == 32) {
                space++;
            } else if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
                number++;
            }  else {
                symbols++;
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'A' || a.charAt(i) == 'a' || a.charAt(i) == 'E' || a.charAt(i) == 'e' || a
                    .charAt(i) == 'I' || a.charAt(i) == 'i' || a.charAt(i) == 'O' || a.charAt(i) == 'o' || a
                            .charAt(i) == 'U'
                    || a.charAt(i) == 'u') {
                vowels++;
            }
        }
        System.out.println("\nNo. of UpperCase :" + upper);
        System.out.println("\nNo. of LowerCase :" + lower);
        System.out.println("\nNo. of vowels    :" + vowels);
        System.out.println("\nNo. of Numbers   :" + number);
        System.out.println("\nNo. of Symbols   :" + symbols);
    }
}

public class StringReverse {
    public static void main(String args[]) {
        //program to reverse a given string

        StringBuilder a = new StringBuilder("remag eht kcihtraK");
        System.out.println("The orginal string: \t" + a + "\n\n");
        StringBuilder b = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        System.out.println("I am " + b);

        // program to convert string into uppercase, reason for using string builder becauase we can change the value inbuilt
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) >= 97 && b.charAt(i) <= 122) {
                int c = (int) b.charAt(i) - 32;
                b.setCharAt(i, (char) c);
            }
            System.out.println("\n" + b);
        }
        
        for (int i = 0; i < b.length(); i++) { // initialize i as index value for the string. comparing with length of b, if satisfied value increments. 
            
            if (b.charAt(i) >= 65 && b.charAt(i) <= 90) { // checking whether the ASCII value of the character under range of uppercase. (charAt function is used to access the integer value of the string)
                
                int d = (int) b.charAt(i) + 32; //converting the character as integer and subtracting 32, then setting it to integer C...

                b.setCharAt(i, (char) d); //setCharAt is used assigned the index value and replace a character, string or integer and placing at the integer...
            }
        }

        System.out.println("\n" + b); //you are converting and storing the characters of strings in same variable we declared first.
    }
}
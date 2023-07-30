public class StringBuffer_StringBuilder {
    // StringBuffer and StringBuilder
    public static void main(String args[]) {

        StringBuffer buffer = new StringBuffer("Karthick");        
        System.out.println(buffer);

        buffer.append(" Palanivel");
        System.out.println(buffer);
        buffer.insert(8," S/o");
        System.out.println(buffer);

        buffer.replace(19, 22, "        ");
        System.out.println(buffer);

    //     StringBuffer buffer = new StringBuffer("Tutor");
        
    //     buffer.append(" joes");
        
    //     buffer.insert(10, "computer");
        
    //     buffer.replace(9, 11, "@@@");
        
    //     buffer.reverse();
        
    //     buffer.delete(9, 11); // 

    //   //  buffer.substring(); // cuts of particular character from the string but if 0, no action is done.

    //    // buffer.setCharAt(0, "@"); used to replace any kind of character from the given string

    //We can't use this in the string literals, because that is immutable.
    }
}
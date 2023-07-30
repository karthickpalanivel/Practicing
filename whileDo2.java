public class whileDo2 {
    public static void main(String args[]){
        int i=0, j=1;
        while (i < 5) {
            do {
                j++;
                System.out.println(i);
            }
            while(j<3);
            i++;
        }
    }
}
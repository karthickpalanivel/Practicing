public class fornested {
    public static void main(String args[]) {
        int a=200, i, j, val, rem, b, sum = 10;
    b=a;
    for(i=0;b>0;b=b/10){
        rem=b/5;
        for(j=i, val=2;j>=0;--j){
            val = val*10;
        }
        if(rem<100){
            rem = rem+b;
        }
        
        sum = sum + val + rem;
    }
    System.out.println(sum);   
    }
}
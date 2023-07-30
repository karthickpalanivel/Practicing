
class cons{
    int a,b,c;
    public cons(){
        a =10;
        b = 250;
    }

    public int cal()
    {
        c = a+b;
        return c;
    }
}

class constructor_demo{
    public static void main(String args[]){
        cons c1 = new cons();
        int sum = c1.cal();
        System.out.println("Sum = "+sum);
    }
}
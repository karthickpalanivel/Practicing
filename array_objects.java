import java.util.*;

class Student {
    public int roll_no;
    public String name;
    
    Student(int roll, String stu_name){
        this.roll_no=roll;
        this.name = stu_name;
    }

    void print(){
       System.out.println("Name   : "+ name);
       System.out.println("Roll no: "+roll_no+"\n");
    }
}

public class array_objects {
    public static void main(String args[]) {
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(10, "hello");
        arr[1] = new Student(20, "hi");

        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }

        
        // int n;
        // System.out.println("Enter the no. of Students need to entered: ");
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // int roll;
        // String stu_name;
        // Student[] arr = new Student[n];
        // for (int i = 0; i < n; i++) {
        //     roll = sc.nextInt();
        //     stu_name = sc.nextLine();
        //     arr[i] = new Student(roll, stu_name);
        // }
        // System.out.println(Arrays.toString(arr));
    }
}

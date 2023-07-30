import java.util.*;

class shape {
    float length, breadth, radius;
}

class rectangle extends shape {
    public rectangle(float l, float b) {
        length = l;
        breadth = b;
    }

    float area_rect() {
        return length * breadth;
    }
}

class circle extends shape {
    public circle(float r) {
        radius = r;
    }

    float area_circle() {
        return 3.14f*(radius*radius);
    }
}

class square extends shape {
    public square(float l) {
        length = l;
    }

    float area_square(){
        return length * length;
    }
}
public class Hierarchical_Inheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        
        rectangle rect = new rectangle(a, b);
        System.out.println(rect.area_rect());
        circle cir = new circle(c);
        System.out.println(cir.area_circle());
        square sq = new square(a);
        System.out.println(sq.area_square());

    }    
}
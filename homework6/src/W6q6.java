import java.util.Scanner;

/*6. Write a program to enter any radius value of the circle and find out the area. (Formula
    of Area A=PI*r*r).*/
public class W6q6 {

    public void radius(){

        float pi=3.14f, radius;
        int r ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Radius:" );
        r=s.nextInt();
        radius=pi*r*r;
        System.out.println("Area of Circle is: "+radius);
    }

    public static void main(String[] args) {
        W6q6 q6=new W6q6();
        q6.radius();
    }
}

import java.util.Scanner;

/*7. Write a program to insert any temperature value in degree Fahrenheit and convert
    to degree Celsius ((F − 32) × 5/9 = 0°C).*/
public class W6q7 {

    public void celsius(){

        int c,f;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:" );
        f=s.nextInt();
        c=(f - 32) * 5 / 9;
        System.out.println("Area of Circle is: "+c);
    }

    public static void main(String[] args) {
        W6q7 q7=new W6q7();
        q7.celsius();
    }
}

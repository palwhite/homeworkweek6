import java.util.Scanner;

/*12. Write a Java program that takes three numbers as input to calculate and print the
    average of the numbers.*/
public class W6q12 {

    public void avg(){

        int a , b, c;
        float ans;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=s.nextInt();
        System.out.println("Enter Second Number: ");
        b=s.nextInt();
        System.out.println("Enter Third Number: ");
        c=s.nextInt();

        ans=(float)(a + b+ c)/ 3;

        System.out.println("Average is: "+ans);
    }

    public static void main(String[] args) {
        W6q12 q12=new W6q12();
        q12.avg();
    }
}

import java.util.Scanner;

public class Question4 {

    /*Write a Java program that takes two numbers as input and display the
    product of two numbers.
    Test Data:
    Input first number: 25
    Input second number: 5
    Expected Output : 25 x 5 = 125*/

    public static void main(String[] args) {

        Question4 q4= new Question4();
        q4.a();

    }
    public void a(){
        Scanner scanner=new Scanner(System.in);
        int a,b,ans;
        System.out.println("Enter First Number: ");
        a= scanner.nextInt();
        System.out.println("Enter Second Number:");
        b= scanner.nextInt();
        ans=a*b;
        System.out.println("Expected Output: "+ans);

    }
}

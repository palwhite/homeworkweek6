import java.util.Scanner;

/*10. Write a Java program that takes a number as input and prints its multiplication
    table up to 10.
    Test Data: Input a number: 8.
    Expected Output:
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        8 x 10 = 80*/
public class W6q10 {

    public void mul(){
        int a,ans,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number for Table:");
        a=s.nextInt();

        for (i=1;i<=10;i++){
                ans=a*i;
            System.out.println(a +"*"+ i +"=" +ans);
        }
    }

    public static void main(String[] args) {
        W6q10 q10=new W6q10();
        q10.mul();

    }
}

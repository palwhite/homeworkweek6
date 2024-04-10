import java.util.Scanner;

/*9. Write a program to convert the upper case to lower case.*/
public class W6q9 {

    public void upper(){
        String lc;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter String to Convert in UpperCase: " );
        lc=s.nextLine();

        System.out.println("String into UpperCase: "+lc.toUpperCase());
    }

    public static void main(String[] args) {
        W6q9 q9=new W6q9();
        q9.upper();
    }
}

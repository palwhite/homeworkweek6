public class Question3 {

    /*
    Write a Java program to print the result of the following operations.
    Test Data: a. -5 + 8 * 6
               b. (55+9) % 9
               c. 20 + -3*5 / 8
               d. 5 + 15 / 3 * 2 - 8 % 3
    Expected Output : 43
                      1
                      19
                      13
     */

    public static void main(String[] args) {

        Question3 q3=new Question3();
        q3.a();
        q3.b();
        q3.c();
        q3.d();

    }
    //a. -5 + 8 * 6
    public void a(){
        int a=5,b=8,c=6,ans;
        ans=-a+b*c;
        System.out.println("a. -5 + 8 * 6: "+ans);

    }
    // b. (55+9) % 9
    public void b(){
        int a=55,b=9,ans;
        ans=(a+b) % b;
        System.out.println("b. (55 + 9) % 9: "+ans);

    }
    //c. 20 + -3*5 / 8
    public void c(){
        int a=20,b=3,c=5,d=8,ans;
        ans=a+(-b)*c/d;
        System.out.println("c. 20 + -3 * 5 / 8: "+ans);

    }
    // d. 5 + 15 / 3 * 2 - 8 % 3
    public void d(){
        int a=5,b=15,c=3,d=2,e=8,ans;
        ans=a+b/c*d-e%c;
        System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3: "+ans);

    }
}

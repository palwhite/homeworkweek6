/*2. Write a Java programme using the following steps.
    2.1 Declare two static variables.
    2.2 Declare one static method.
    2.3 Call both static variables into the static method inside the print statement.
    2.4 Declare the Main method.
    2.5 Call the static method into the Main method and run the programme.*/
public class W6q2 {
    //Declaring two static variable.
    static int a,b;
    //Creating static Method
    static void staticmethod(){
        a=10;
        b=10;
        System.out.println("My first static method");
        System.out.println("Printing first static Variable: "+a);
        System.out.println("Printing second static Variable: "+b);
    }

    //using static method in main method.
    public static void main(String[] args) {

        staticmethod();
    }
}

/*1. Write a Java programme using the following steps.
        1.1 Declare two instance variables.
        1.2 Declare one instance method.
        1.3 Call both instance variables into the instance method inside the print statement.
        1.4 Declare the Main method.
        1.5 Call the above instance method into the Main method and run the programme.*/
public class W6q1 {

    //Two Instance Variables.
    int a,b;

    //Instance Method
    public void instance(){
        a=10;
        b=20;
        System.out.println("My first instance method");
        System.out.println("Printing first Variable: "+a);
        System.out.println("Printing second Variable: "+b);
    }

    //calling instance method into main method
    public static void main(String[] args) {

        W6q1 q1= new W6q1();
        q1.instance();
    }
}

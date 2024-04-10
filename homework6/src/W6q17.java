/*17. Write a Java Program using below steps.
    17.1 Declare your city as instance variables.
    17.2 Declare your country as static variables.
    17.3 Declare one instance method and call static variable in print statement
    17.4 Declare static method and call instance variable in print Statement.
    17.5 Call both user defined methods into main method.*/
public class W6q17 {

    public String city=" City Instance Variable";
    static String country="Country Static Variable";

    public void insmethod(){
        System.out.println("Inside Instance Method " + country);
    }

    static void statmethod(){
        W6q17 q17=new W6q17();
        System.out.println("Inside Static Method " + q17.city );

    }

    public static void main(String[] args) {
        W6q17 q17=new W6q17();
        q17.insmethod();
        statmethod();
    }
}

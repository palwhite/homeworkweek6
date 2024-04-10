/*20. Write a Java Program using below steps.
    20.1 Declare your Spain as static variable.
    20.2 Declare your United Kingdom as instance variable.
    20.3 Declare instance method name homeCountry()and call static variable.
    20.4 Declare static method name holidays() and call instance variable
    20.5 Call both methods in main method.*/
public class W6q20 {
    static String spain="Spain";
    String unitedkingdom="United Kingdom";

    public void homeCountry(){
        System.out.println(spain + " is my HomeCountry");
    }

    static void holidays(){
        W6q20 q20=new W6q20();
        System.out.println("I want to go " +q20.unitedkingdom + "for my Holidays");
    }

    public static void main(String[] args) {
        W6q20 q20=new W6q20();
        q20.homeCountry();
        holidays();
    }
}

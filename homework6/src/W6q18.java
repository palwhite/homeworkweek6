/*18. Write a Java Program using below steps.
    18.1 Declare your council name as static variables.
    18.2 Declare your house number as instance variables.
    18.3 Declare one instance method name borough() and call Static variable
    18.4 Declare static method name address() and call instance variable
    18.5 Call both user defined methods into main method.*/
public class W6q18 {

    static String councilname= "Nirali";
    String housenumber= "123";

    public void borough(){
        System.out.println("Name on the address is: "+ councilname);
    }

    static void address(){
        W6q18 q18=new W6q18();
        System.out.println("House number is: "+ q18.housenumber);
    }

    public static void main(String[] args) {
        W6q18 q18=new W6q18();
        address();
        q18.borough();
    }
}

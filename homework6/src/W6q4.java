/*4. Write a Java programme using the following steps.
    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.*/
public class W6q4 {
    //Declaring two instance Variables.
    String inst= "instance variable";
    String inst1="second instance variable";
    //Declaring two static Variables.
    static String staticvar= "Static Variable";
    static String staticvar1="second static variable";

    //instance Method
    public void instanceMethhod(){
        System.out.println(inst + "in instance Method");
        System.out.println(inst1 + "in instance Method");
        System.out.println(staticvar + "in instance Method");
        System.out.println(staticvar1 + "in instance Method");
    }

    //static method
    static void staticmethod(){
        W6q4 q4=new W6q4();
        System.out.println("\n"+q4.inst + "in static Method");
        System.out.println(q4.inst1 + "in static Method");
        System.out.println(staticvar + "in static Method");
        System.out.println(staticvar1 + "in static Method");

    }

    //calling instance and static methods in main method.
    public static void main(String[] args) {
        W6q4 q4=new W6q4();
        q4.instanceMethhod();
        staticmethod();
    }
}

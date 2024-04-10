/*3. Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.*/
public class W6q3 {
     //Declaring instance Variable.
    String inst= "instance variable";
    //Declaring static Variable.
   static String staticvar= "Static Variable";

    //instance Method
    public void instanceMethhod(){
        System.out.println(inst + "in instance Method");
        System.out.println(staticvar + "in instance Method");
    }

    //static method
    static void staticmethod(){
        W6q3 q3=new W6q3();
        System.out.println("\n"+q3.inst + "in static Method");
        System.out.println(staticvar + "in static Method");
    }

    //calling instance and static methods in main method.
    public static void main(String[] args) {
        W6q3 q3=new W6q3();
        q3.instanceMethhod();
        staticmethod();
    }
}

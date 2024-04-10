/*19. Write a Java Program using below steps.
    19.1 Declare one of your group member names as instance variable.
    19.2 Declare one of your group member names as static variable.
    19.3 Declare one instance method name with group name (e.g. selenium())and call both global
        variables.
    19.4 Declare static method name agile() and call both variable
    19.5 Call both user defined methods into main method.
    Note: Declare 1 local variables in all user defined method and main method and print in to statement*/
public class W6q19 {

    String groupname1="Nirali";
    static String groupname2="Minal";

    public void selenium(){
        int a=10;
        System.out.println("instance selenium groupname1 "+groupname1);
        System.out.println("instance selenium groupname2 "+ groupname2);
        System.out.println("Local Variable in selenium"+a);
    }

    static void agile(){
        int b=10;
        W6q19 q19=new W6q19();
        System.out.println("static agile groupname1 "+ q19.groupname1);
        System.out.println("static agile groupname2 "+ groupname2);
        System.out.println("Local Variable in Agile "+b);
    }

    public static void main(String[] args) {
        W6q19 q19=new W6q19();
        q19.selenium();
        agile();
    }
}

public class Question2 {

    /*
     Write a Java program to divide two numbers and print on the screen.
     Test Data: 50/3
     Expected Output: 16
     */
    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.divide();

    }
    public void divide(){
        int x = 50;
        int y = 3;
        int divide = x/y;
        System.out.println("Test Data: 50/3 ");
        System.out.println("Expected Output: "+divide);
    }
}

public class Question1 {

    /*
    Write a Java program to print the sum of two numbers.
    Test Data: 74 + 36
    Expected Output: 110
     */

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.sum();

    }
    public void sum(){
        int x = 74;
        int y = 36;
        int sum = x+y;
        System.out.println("Test Data: 74 + 36 ");
        System.out.println("Expected Output: "+sum);
    }
}

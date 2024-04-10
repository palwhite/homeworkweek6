/*15. Write a Java program to convert a given string into lowercase.
    Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
    Output: the quick brown fox jumps over the lazy dog.*/
public class W6q15 {
    public void lower(){
        String upc;
        upc="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        //Scanner s=new Scanner(System.in);

       /* System.out.println("Enter String to Convert in UpperCase: " );
        upc=s.nextLine();*/

        System.out.println("\nString into LowerCase: "+upc.toLowerCase());
    }

    public static void main(String[] args) {
        W6q15 q15=new W6q15();
        q15.lower();
    }
}

import java.util.Scanner;
public class IT24100652Lab4Q3 {
    public static void main(String[] args) { 
       Scanner input = new Scanner(System.in);

       System.out.println("Enter a Number: ");
       int numTocheck = input.nextInt();

       String result = (numTocheck > 0)? "This Number is Positive" :
                       (numTocheck < 0)? "This Number is Negative" :
                        "This is Zero!!";

      
      System.out.println(result);

   }

}
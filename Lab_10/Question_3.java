/*Allen G Meti
*24019726
*Lab 10 Question 3
*/

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to divide 100 by: ");
        int number = input.nextInt();

        //Risky code: dividing by a number the user entered
        try {
            System.out.println("Result: " + (100 / number));
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            //The finally block always runs, whether or not an exception happened
            System.out.println("Done processing");
        }

        input.close();
    }
}

/*Allen G Meti
*24019726
*Lab 10 Question 1
*/

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for two numbers
        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        //Dividing inside a try block and catching the exception if the second number is 0
        try {
            int result = first / second;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        input.close();
    }
}

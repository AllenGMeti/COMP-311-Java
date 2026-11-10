/*Allen G Meti
*24019726
*Lab 10 Question 2
*/

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        //Asking the user for the index and for a number to divide 100 by
        System.out.print("Enter an index (0 - 4): ");
        int index = input.nextInt();

        System.out.print("Enter a number to divide 100 by: ");
        int divisor = input.nextInt();

        //Storing the result in the array at the chosen index
        try {
            numbers[index] = 100 / divisor;
            System.out.println("Stored " + numbers[index] + " at index " + index);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index: " + e.getMessage());
        }

        input.close();
    }
}

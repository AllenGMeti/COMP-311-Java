/*Allen G Meti
*24019726
*Lab 10 Question 8
*/

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        //Asking the user for an index
        System.out.print("Enter an index (0 - 4): ");
        int index = input.nextInt();

        //Accessing the array and handling an index that is out of bounds
        try {
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index: " + e.getMessage());
        }

        input.close();
    }
}

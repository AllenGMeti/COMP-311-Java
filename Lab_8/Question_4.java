/*Allen G Meti
*24019726
*Lab 8 Question 4
*/

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for a number
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        //Using Math.pow() to get the square and the cube
        System.out.println("Square: " + Math.pow(number, 2));
        System.out.println("Cube: " + Math.pow(number, 3));

        //Using Math.sqrt() to get the square root
        System.out.println("Square root: " + Math.sqrt(number));

        input.close();
    }
}

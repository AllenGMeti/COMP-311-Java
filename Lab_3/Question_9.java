/*
 * Allen G Meti
 * 24019726
 * Lab 3 Question 9
 */

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        int factorial = 1;

        // Calculating factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Displaying result
        System.out.println("Factorial = " + factorial);

        input.close();
    }
}
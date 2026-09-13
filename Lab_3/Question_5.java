/*
 * Allen G Meti
 * 24019726
 * Lab 3 Question 5
 */

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        // Repeating until valid number is entered
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = input.nextInt();

        } while (number < 1 || number > 10);

        System.out.println("Valid number entered: " + number);

        input.close();
    }
}
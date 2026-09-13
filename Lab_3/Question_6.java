/*
 * Allen G Meti
 * 24019726
 * Lab 3 Question 6
 */

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        // Repeatedly asking user for numbers
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();

            total += number; 

        } while (number != 0);

        // Displaying result
        System.out.println("Total = " + total);

        input.close();
    }
}
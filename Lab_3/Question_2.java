/*
 * Allen G Meti
 * 24019726
 * Lab 3 Question 2
 */

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter a positive whole number: ");
        int number = input.nextInt();

        int sum = 0;
        int i = 1;

        // Calculating sum using while loop
        while (i <= number) {
            sum += i; 
            i++;      
        }

        // Displaying result
        System.out.println("Sum = " + sum);

        input.close();
    }
}
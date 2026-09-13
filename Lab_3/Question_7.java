/*
 * Allen G Meti
 * 24019726
 * Lab 3 Question 7
 */

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Asking user for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 1 to 12 to write multiplication table
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
}
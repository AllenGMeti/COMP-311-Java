/*
 * Allen G Meti
 * 24019726
 * Lab 3 Question 4
 */

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        // Do-while loop to repeat menu
        do {
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

        // Stopping when user enters 2
        } while (choice != 2); 

        System.out.println("Program exited.");

        input.close();
    }
}
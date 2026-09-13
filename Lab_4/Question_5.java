/*
 * Allen G Meti
 * 24019726
 * Lab 4 Question 5
 */

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine();

        // Removing spaces and converting to lowercase
        text = text.replaceAll(" ", "").toLowerCase();

        String reversed = "";

        // Reversing string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        // Checking palindrome
        if (text.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        input.close();
    }
}
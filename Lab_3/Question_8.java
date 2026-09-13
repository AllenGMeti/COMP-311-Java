/*
 * Allen G Meti
 * 24019726
 * Lab 3 Question 8
 */

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine();

        int count = 0;

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            // Checking if a character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Displaying result
        System.out.println("Number of vowels: " + count);

        input.close();
    }
}
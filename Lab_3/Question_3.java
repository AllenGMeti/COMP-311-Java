/*
 * Allen G Meti
 * 24019726
 * Lab 3 Question 3
 */

public class Question_3 {
    public static void main(String[] args) {

        int number = 1;

        // Loop through numbers 1 to 50
        while (number <= 50) {

            // Checking if number is even
            if (number % 2 == 0) {
                System.out.println(number);
            }

            // Moving to next number
            number++; 
        }
    }
}
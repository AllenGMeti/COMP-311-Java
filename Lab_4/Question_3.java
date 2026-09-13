/*
 * Allen G Meti
 * 24019726
 * Lab 4 Question 3
 */

import java.io.PrintWriter;

public class Question_3 {
    public static void main(String[] args) {

        try {
            int[] numbers = {5, 12, 3, 9, 21, 7};

            int sum = 0;
            int smallest = numbers[0];
            int largest = numbers[0];

            // Process array
            for (int i = 0; i < numbers.length; i++) {

                sum += numbers[i];

                if (numbers[i] < smallest) {
                    smallest = numbers[i];
                }

                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            // Write results to file
            PrintWriter writer = new PrintWriter("results.txt");

            writer.println("Sum: " + sum);
            writer.println("Smallest: " + smallest);
            writer.println("Largest: " + largest);

            writer.close();

        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}
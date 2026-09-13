/*
 * Allen G Meti
 * 24019726
 * Lab 4 Question 1
 */

import java.io.PrintWriter;

public class Question_2 {
    public static void main(String[] args) {

        try {
            double[] numbers = {2.5, 3.6, 7.8, 1.2, 9.4};

            PrintWriter writer = new PrintWriter("output.txt");

            // Writing each number to file
            for (int i = 0; i < numbers.length; i++) {
                writer.println(numbers[i]);
            }

            writer.close();

            System.out.println("Data written to file.");

        } catch (Exception e) {
            System.out.println("Error writing to file.");
        }
    }
}
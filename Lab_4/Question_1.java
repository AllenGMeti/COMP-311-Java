/*
 * Allen G Meti
 * 24019726
 * Lab 4 Question 1
 */

import java.io.File;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        try {
            File file = new File("names.txt");
            Scanner input = new Scanner(file);

            String[] names = new String[20];
            int index = 0;

            // Reading words into array
            while (input.hasNext() && index < names.length) {
                names[index] = input.next();
                index++;
            }

            input.close();

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}
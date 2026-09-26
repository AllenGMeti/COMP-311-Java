/*Allen G Meti
*24019726
*Lab 7 Question 3
*/

import java.io.File;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        try {

            // Trying to open a file that does not exist
            File file = new File("missing.txt");
            Scanner input = new Scanner(file);

            // If the file is found, read and print its contents
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

            input.close();
        } catch (Exception e) {
            // If the file is not found, print an error message
            System.out.println("File not found.");
        }
    }
}
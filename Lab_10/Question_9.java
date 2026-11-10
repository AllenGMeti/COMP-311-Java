/*Allen G Meti
*24019726
*Lab 10 Question 9
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {

        //The Scanner is declared inside the brackets after try, so it is closed automatically
        try (Scanner input = new Scanner(new File("story.txt"))) {

            //Reading the file and printing each line
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

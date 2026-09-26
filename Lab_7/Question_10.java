/*Allen G Meti
*24019726
*Lab 7 Question 10
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(new File("results.txt"));
        PrintWriter writer = new PrintWriter("passed.txt");

        //Reading the contents of results.txt and writing the names and scores of students who passed to passed.txt
        while (input.hasNextLine()) {

            String line = input.nextLine();
            String[] parts = line.split(",");

            String name = parts[0];
            int score = Integer.parseInt(parts[1]);

            //Checking if the score is greater than or equal to 50 and writing the name and score to passed.txt
            if (score >= 50) {
                writer.println(name + "," + score);
            }
        }

        input.close();
        writer.close();
    }
}
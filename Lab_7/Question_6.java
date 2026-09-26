/*Allen G Meti
*24019726
*Lab 7 Question 6
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) throws Exception {

        //Copying the contents of story.txt to story_copy.txt
        Scanner input = new Scanner(new File("story.txt"));
        PrintWriter writer = new PrintWriter("story_copy.txt");

        //Reading the contents of story.txt and writing it to story_copy.txt
        while (input.hasNextLine()) {
            writer.println(input.nextLine());
        }

        input.close();
        writer.close();
    }
}
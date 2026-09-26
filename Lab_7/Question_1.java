/*Allen G Meti
*24019726
*Lab 7 Question 1
*/

import java.io.File;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) throws Exception {

        //Openning the file and creating a scanner to read the file
        File file = new File("story.txt");
        Scanner input = new Scanner(file);

        //Reading the file and printing the contents of the file
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }

        //Closing the scanner
        input.close();
    }
}
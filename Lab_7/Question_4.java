/*Allen G Meti
*24019726
*Lab 7 Question 4
*/

import java.io.File;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) throws Exception {

        File file = new File("story.txt");
        Scanner input = new Scanner(file);

        int count = 0;

        //Counting the number of lines in the file
        while (input.hasNextLine()) {
            input.nextLine();
            count++;
        }

        //Printing the number of lines in the file
        System.out.println(count);

        input.close();
    }
}
/*Allen G Meti
*24019726
*Lab 7 Question 5
*/

import java.io.File;
import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) throws Exception {

        File file = new File("story.txt");
        Scanner input = new Scanner(file);

        int count = 0;

        //Counting the number of words in the file
        while (input.hasNext()) {
            input.next();
            count++;
        }

        //Printing the number of words in the file
        System.out.println(count);

        input.close();
    }
}
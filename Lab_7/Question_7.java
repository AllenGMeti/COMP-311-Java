/*Allen G Meti
*24019726
*Lab 7 Question 7
*/

import java.io.FileWriter;
import java.io.PrintWriter;

public class Question_7 {
    public static void main(String[] args) throws Exception {

        //Opening the file in append mode
        PrintWriter writer = new PrintWriter(new FileWriter("output.txt", true));

        //Appending to the file
        writer.println("Now I see why its called hell week.");
        writer.println("Yeah noh");

        writer.close();
    }
}
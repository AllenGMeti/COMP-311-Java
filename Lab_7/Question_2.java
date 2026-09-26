/*Allen G Meti
*24019726
*Lab 7 Question 2
*/

import java.io.PrintWriter;

public class Question_2 {
    public static void main(String[] args) throws Exception {

        //Creating a writer
        PrintWriter writer = new PrintWriter("output.txt");

        //Writting to the file
        writer.println("Allen G Meti");
        writer.println("Week 7 report");
        writer.println("Biust 10");
        writer.println("Me -2");
        writer.println("Next match: week 9");

        //Closing the writer
        writer.close();
    }
}
/*Allen G Meti
*24019726
*Lab 7 Question 9
*/

import java.io.PrintWriter;
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("results.txt");

        //Prompting the user to enter names and scores of 3 students and writing them to results.txt
        for (int i = 0; i < 3; i++) {

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter score: ");
            int score = input.nextInt();
            input.nextLine();

            //Writing the name and score to results.txt
            writer.println(name + "," + score);
        }

        writer.close();
        input.close();
    }
}
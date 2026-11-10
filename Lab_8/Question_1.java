/*Allen G Meti
*24019726
*Lab 8 Question 1
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Question_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //Creating a StringTokenizer to break the sentence into words
        StringTokenizer st = new StringTokenizer(sentence);

        //Printing each word on its own line
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        input.close();
    }
}

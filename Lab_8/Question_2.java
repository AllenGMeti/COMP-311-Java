/*Allen G Meti
*24019726
*Lab 8 Question 2
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Question_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //Creating a StringTokenizer to break the sentence into words
        StringTokenizer st = new StringTokenizer(sentence);

        //Printing how many words the sentence contains
        System.out.println("Number of words: " + st.countTokens());

        input.close();
    }
}

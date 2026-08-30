/*
*Allen G Meti
*24019726
*Lab 1 Question 9
*/

//Importing Scanner
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Prompting and reading user input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

//Printing use input
        System.out.println("Length: " + sentence.length());
        System.out.println("Upper case: " + sentence.toUpperCase());
        System.out.println("Lower case: " + sentence.toLowerCase());
        System.out.println("Contains \"Java\": " + sentence.contains("Java"));

        sc.close();
    }
}
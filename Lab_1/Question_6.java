/*
*Allen G Meti
*24019726
*Lab 1 Question 6
*/

//Importing Scanner
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Prompting and reading user input
        System.out.print("Enter three scores: ");
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();

//Calculating average
        double average = (score1 + score2 + score3) / 3;

//Printing calculated average
        System.out.println("Average: " + average);

        sc.close();
    }
}
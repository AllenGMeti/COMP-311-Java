/*
* Allen G Meti
* 24019726
* Lab 2 Question 2
*/

//Importing Scanner
import java.util.Scanner;

public class Question_2 {
  public static void main (String[] args) {
    //Creating scanner
    Scanner console = new Scanner (System.in);

    //Prompting user and reading user input
    System.out.print("Enter your full name: ");
    String fullName = console.nextLine();

    //Performing string operations
    System.out.println("Full name length: "+ fullName.length());
    System.out.println("Full name in Uppercase: " + fullName.toUpperCase());
    System.out.println("Full name in lowercase: " + fullName.toLowerCase());

    //Checking first letter of the name
    System.out.print("Enter a letter to check: ");
    String firstLetter = console.nextLine();

    //Comparing first letter
    if (fullName.toLowerCase().startsWith(firstLetter.toLowerCase())){
      System.out.println("The name starts with that letter.");
    } else {
      System.out.println("The name does not start with that letter.");
    }

    console.close();
  }
}

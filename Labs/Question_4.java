/*
 * Allen G Meti
 * 24019726
 * Lab 1 Question 4
 */

//Importing Scanner
import java.util.Scanner;

public class Question_4 {
  public static void main (String[] args){
  Scanner sc = new Scanner(System.in);

//Prompting and reading user input
  System.out.print("Enter a whole number: ");
  int num = sc.nextInt();

  System.out.print("Enter a decimal number: ");
  double dec = sc.nextDouble();

  System.out.print("Enter a single word: ");
  String word = sc.next();

//Printing user input
   System.out.println("You entered " + num + ", " + dec + ", and the word \"" + word + "\".");
   sc.close();

 }
 }

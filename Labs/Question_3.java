/*
*Allen G Meti
*24019726
*Lab 1 Question 3 
*/

//Importing Scanner
import java.util.Scanner;

public class Question_3 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 //Prompting and reading user input
 System.out.print("Enter your name: ");
 String name = sc.nextLine();
 
 System.out.print("Enter your age: ");
 int age = sc.nextInt();

 //Printing user input 
 System.out.println("Hello " + name + "! In five years, you will be " + (age + 5));

 sc.close();

 }
}

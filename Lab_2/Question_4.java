/*
* Allen G Meti
*24019726
* Lab 2 Question 4
*/

//Importing file writter, exception and scanner
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_4 {

   public static void main(String[] args) throws IOException {

     Scanner console = new Scanner(System.in);

     // Creating file writer
     FileWriter writer = new FileWriter("results.txt");

     // Loop for 5 students
     for (int i = 1; i <= 5; i++) {

     //Prompting user and reading file input
     System.out.print("Enter name of student " + i + ": ");
     String name = console.nextLine();

     System.out.print("Enter score of student " + i + ": ");
     int score = console.nextInt();
     console.nextLine();

     // Writting to file
     writer.write(name + "," + score + "\n");
     }

     writer.close();
     console.close();
   }
}

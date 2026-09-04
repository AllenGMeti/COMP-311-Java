/*
*Allen G Meti
*24019726
*Lab 2 Question 10
*/

//Importing file reader,exception handler, scanner
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question_10 {
  public static void main(String[] args) throws IOException {

   //Creating scanner for user input
   Scanner console = new Scanner(System.in);

   //Prompting user
   System.out.print("Enter a number to search: ");
   int target = console.nextInt();

   //Opening file for reading
   Scanner reader = new Scanner(new FileReader("numbers.txt"));

   //Searching for number
   boolean found = false;

   while (reader.hasNextInt()) {
   int num = reader.nextInt();

   if (num == target) {
   found = true;
   break;
   }
  }

  //Printing result
  System.out.println(found);

   //Closing files
   reader.close();
   console.close();
  }
}

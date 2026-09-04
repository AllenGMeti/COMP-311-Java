/*
*Allen G Meti
*24019726
Lab 2 Question 8
*/

//Importing reader, writter, exception handler, scanner
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_8 {
  public static void main(String[] args) throws IOException {

  //Opening file for reading
  Scanner reader = new Scanner(new FileReader("numbers.txt"));

   //Creating file writer
   FileWriter writer = new FileWriter("evenodd.txt");

   //Initializing counters
   int even = 0;
   int odd = 0;

   //Reading numbers from file
    while (reader.hasNextInt()) {
    int num = reader.nextInt();

    if (num % 2 == 0) {
     even++;
    } else {
    odd++;
     }
    }

    //Writing results to file
    writer.write("Even numbers: " + even + "\n");
    writer.write("Odd numbers: " + odd + "\n");

     //Closing files
     reader.close();
     writer.close();
   }
}

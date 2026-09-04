/*
* Allen G Meti
* 24019726
*Lab 2 Question 7
*/

//Importing file reader, writter, exception handler, scanner
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_7 {
  public static void main(String[] args) throws IOException {

  //Opening file for reading
  Scanner reader = new Scanner(new FileReader("numbers.txt"));

  //Creating file writer
  FileWriter writer = new FileWriter("stats.txt");

  //Initializing variables
  int min = Integer.MAX_VALUE;
  int max = Integer.MIN_VALUE;
  int sum = 0;
  int count = 0;

  //Reading numbers from file
  while (reader.hasNextInt()) {
  int num = reader.nextInt();

  if (num < min) {
  min = num;
   }

   if (num > max) {
   max = num;
   }

   sum += num;
   count++;
   }

   //Calculating average
    double average = (double) sum / count;

   //Writing results to file
   writer.write("Smallest: " + min + "\n");
   writer.write("Largest: " + max + "\n");
   writer.write("Average: " + average + "\n");

   //Closing files
   reader.close();
   writer.close();
  }
}

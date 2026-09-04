/*
* Allen G Meti
* 24019726
* Lab 2 Question 9
*/

//Importing reader, writter, exception, scanner
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_9 {
  public static void main(String[] args) throws IOException {

  //Opening file for reading
  Scanner reader = new Scanner(new FileReader("numbers.txt"));

   //Creating file writer
   FileWriter writer = new FileWriter("signs.txt");

   //Initializing variables
   int positiveSum = 0;
   int negativeSum = 0;
   int positiveCount = 0;
   int negativeCount = 0;

   //Reading numbers from file
   while (reader.hasNextInt()) {
   int num = reader.nextInt();

   if (num >= 0) {
   positiveSum += num;
   positiveCount++;
   } else {
   negativeSum += num;
   negativeCount++;
    }
   }

  //Writing results to file
   writer.write("Positive sum: " + positiveSum + "\n");
   writer.write("Positive count: " + positiveCount + "\n");
   writer.write("Negative sum: " + negativeSum + "\n");
   writer.write("Negative count: " + negativeCount + "\n");

   //Closing files
   reader.close();
   writer.close();
   }
}

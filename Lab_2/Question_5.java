/*
* Allen G Meti
* 24019726
* Lab 2 Question 5
*/

//Importing file reader, writter, exception handler, scanner
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_5 {
  public static void main(String[] args) throws IOException {

   //Opening file for reading
   Scanner reader = new Scanner(new FileReader("students.txt"));

   //Creating file writer
   FileWriter writer = new FileWriter("grades.txt");

   //Reading from file and processing data
   while (reader.hasNextLine()) {
     String line = reader.nextLine();

   //Splitting name and score
   String[] parts = line.split(",");
   String name = parts[0];
   int score = Integer.parseInt(parts[1]);

   //Determining grade
   String grade;
   if (score >= 80) {
   grade = "A";
   } else if (score >= 70) {
   grade = "B";
   } else if (score >= 60) {
   grade = "C";
   } else if (score >= 50) {
   grade = "D";
   } else {
   grade = "F";
   }

   //Writing to file
   writer.write(name + "," + score + "," + grade + "\n");
   }

   //Closing files
   reader.close();
   writer.close();
   }
}

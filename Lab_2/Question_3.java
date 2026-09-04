/*
* Allen G Meti
* 24019726
* Lab 2 Question 3
*/

//Importing file reader, exception handler and scanner
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_3 {
  public static void main(String[] args) throws FileNotFoundException {

 // Opening file using Scanner
  Scanner console = new Scanner(new FileReader("students.txt"));

 // Reading and printing each line
    while (console.hasNextLine()) {
       String line = console.nextLine();
       System.out.println(line);
      }

     console.close();
    }
}

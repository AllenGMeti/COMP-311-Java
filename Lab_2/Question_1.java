/*
* Allen G Meti 
* 24019726
* Lab 2 Question 1
*/

//Importing Scanner
import java.util.Scanner;

public class Question_1 {
  public static  void main (String[] args){
    //Creating a Scanner
    Scanner console = new Scanner(System.in);

    //Prompting the user and reading user input
    System.out.print("Enter a numeric score: ");
    int score = console.nextInt();

    //Grading using if and else if statement
    if (score >= 80 && score <=100) {
      System.out.println("Grade: A");
    }else if (score >=70 && score <=79){
      System.out.println("Grade: B");
    }else if (score >=60 && score <=69){
      System.out.println("Grade: C");
    }else if (score >=50 && score <=59){
      System.out.println("Grade: D");
    }else{
      System.out.println("Grade: F");
    }

    console.close();
  }
}

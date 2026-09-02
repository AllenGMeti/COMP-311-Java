/*
*Allen G Meti
*24019726
*Lab 1 Question 8
*/

//Importing Scanner
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Prompting and reading user input 
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

//Calculating Area and Perimeter 
        double area = length * width;
        double perimeter = 2 * (length + width);

//Printing calculated Area and Pereimeter
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        sc.close();
    }
}
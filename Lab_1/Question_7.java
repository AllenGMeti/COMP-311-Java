/*
*Allen G Meti
*24019726
*Lab 1 Question 7
*/

//Importing Scanner
import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting and reading user input
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Converting celsius to fahrenheit
        double fahrenheit = celsius * 9.0 / 5 + 32;

        // Printing temperetures in both celsius and fahrnheit
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");

        sc.close();
    }
}

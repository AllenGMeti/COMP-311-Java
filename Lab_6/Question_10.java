/*
* Allen G Meti
* 24019726
* Lab 6 Question 10
*/

import java.util.Scanner;

public class Question_10 {

    // Method to calculate area
    public static double area(double length, double width) {
        return length * width;
    }

    // Method to calculate perimeter
    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        // Display results
        System.out.println("Area: " + area(length, width));
        System.out.println("Perimeter: " + perimeter(length, width));

        input.close();
    }
}
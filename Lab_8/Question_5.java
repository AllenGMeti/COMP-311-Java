/*Allen G Meti
*24019726
*Lab 8 Question 5
*/

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for three numbers
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        System.out.print("Enter the third number: ");
        double third = input.nextDouble();

        //Math.max() and Math.min() only compare two values, so they are nested to compare three
        double largest = Math.max(first, Math.max(second, third));
        double smallest = Math.min(first, Math.min(second, third));

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        input.close();
    }
}

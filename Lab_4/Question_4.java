/*
 * Allen G Meti
 * 24019726
 * Lab 4 Question 4
 */

 import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        String binary = "";

        // Converting user input to binary
        while (number > 0) {
            binary = (number % 2) + binary;
            number /= 2;
        }

        System.out.println("Binary: " + binary);

        input.close();
    }
}
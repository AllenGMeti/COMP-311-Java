/*
*Allen G Meti
*24019726
*Lab 1 Question 7
*/

//Importing Scanner
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting and reading user input
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine(); 

        // Finding the position of the space between first name and surname
        int spaceIndex = fullName.indexOf(' ');

        // Extracting first name
        String firstName = fullName.substring(0, spaceIndex);

        // Extract surname
        String surname = fullName.substring(spaceIndex + 1);

        // Getting first letter of first name and surname then converting to uppercase
        char firstInitial = Character.toUpperCase(firstName.charAt(0));

        char lastInitial = Character.toUpperCase(surname.charAt(0));

        // Printing user input 
        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + firstInitial + "." + lastInitial + ".");

        sc.close();
    }
}
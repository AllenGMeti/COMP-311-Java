/*Allen G Meti
*24019726
*Lab 10 Question 10
*/

import java.util.Scanner;

public class Question_10 {

    //Method that throws the custom InvalidAgeException if the age is not between 0 and 120
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120");
        }
        System.out.println("Age " + age + " is valid");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        //Catching the custom exception in main
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            //Always runs, no matter what happened
            System.out.println("Thank you for using the program");
        }

        input.close();
    }
}

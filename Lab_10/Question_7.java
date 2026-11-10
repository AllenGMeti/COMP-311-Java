/*Allen G Meti
*24019726
*Lab 10 Question 7
*/

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user to enter a number as text
        System.out.print("Enter a number: ");
        String text = input.nextLine();

        //Converting the text to an int and catching the exception if it isn't a valid number
        try {
            int number = Integer.parseInt(text);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("\"" + text + "\" is not a valid number");
        }

        input.close();
    }
}

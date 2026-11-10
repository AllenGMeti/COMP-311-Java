/*Allen G Meti
*24019726
*Lab 8 Question 7
*/

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for five decimal numbers and rounding each one
        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter decimal number " + i + ": ");
            double number = input.nextDouble();

            //Using Math.round() to round to the nearest whole number
            System.out.println("Rounded: " + Math.round(number));
        }

        input.close();
    }
}

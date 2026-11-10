/*Allen G Meti
*24019726
*Lab 8 Question 10
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Question_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for the operation and the two numbers
        System.out.print("Enter operation,num1,num2 (e.g. multiply,4,5): ");
        String text = input.nextLine();

        //Splitting the text at every comma
        StringTokenizer st = new StringTokenizer(text, ",");

        String operation = st.nextToken();
        double num1 = Double.parseDouble(st.nextToken());
        double num2 = Double.parseDouble(st.nextToken());

        //Using a switch statement to perform the requested operation
        switch (operation) {
            case "add":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "multiply":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "divide":
                //Checking for division by zero before dividing
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Unknown operation");
        }

        input.close();
    }
}

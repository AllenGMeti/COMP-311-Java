/*
*Allen G Meti
*24019726
*Lab 2 Question 6
*/

//Importing scanner
import java.util.Scanner;

public class Question_6 {

    public static void main(String[] args) {

        //Creating scanner
        Scanner console = new Scanner(System.in);

        //Prompting user and reading input
        System.out.print("Enter a number (1-7): ");
        int day = console.nextInt();

        //Switch statement for days
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        //Closing scanner
        console.close();
    }
}

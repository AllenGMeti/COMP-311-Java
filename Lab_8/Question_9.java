/*Allen G Meti
*24019726
*Lab 8 Question 9
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Question_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for a space-separated list of numbers
        System.out.print("Enter numbers separated by spaces: ");
        String numbers = input.nextLine();

        //Splitting the numbers into tokens
        StringTokenizer st = new StringTokenizer(numbers);

        //Saving how many numbers there are before the tokens get used up
        int count = st.countTokens();
        double sum = 0;

        //Converting each token to a double and adding it to the sum
        while (st.hasMoreTokens()) {
            sum += Double.parseDouble(st.nextToken());
        }

        //Checking that at least one number was entered before calculating the average
        if (count > 0) {
            System.out.println("Average: " + (sum / count));
        } else {
            System.out.println("No numbers were entered");
        }

        input.close();
    }
}

/*Allen G Meti
*24019726
*Lab 8 Question 3
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Question_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Asking the user for a comma-separated list of fruits
        System.out.print("Enter fruits separated by commas (e.g. apple,banana,orange): ");
        String fruits = input.nextLine();

        //Creating a StringTokenizer that splits the text at every comma
        StringTokenizer st = new StringTokenizer(fruits, ",");

        //Printing each fruit on its own line
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        input.close();
    }
}

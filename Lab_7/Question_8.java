/*Allen G Meti
*24019726
*Lab 7 Question 8
*/

import java.io.File;
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(new File("numbers.txt"));

        int sum = 0;

        //Calculating the sum of all the numbers in the file
        while (input.hasNextInt()) {
            sum += input.nextInt();
        }

        //Printing the sum of all the numbers in the file
        System.out.println(sum);

        input.close();
    }
}
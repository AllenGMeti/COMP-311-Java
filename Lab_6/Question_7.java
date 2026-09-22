/*
*Allen G Meti
*24019726
*Lab 6 Question 7
*/

public class Question_7 {

    // Method attempts to double value
    public static void tryToDouble(int number) {
        number = number * 2;
    }

    public static void main(String[] args) {

        int num = 10;

        // Calling method
        tryToDouble(num);

        // Printing original value
        System.out.println(num);
    }
}
/*
*Allen G Meti
*24019726
*Lab 6 Question 4
*/

public class Question_4 {

    // Method for integers
    public static int combine(int a, int b) {
        return a + b;
    }

    // Method for doubles
    public static double combine(double a, double b) {
        return a + b;
    }

    // Method for strings
    public static String combine(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Call overloaded methods
        System.out.println(combine(2, 3));
        System.out.println(combine(2.5, 3.5));
        System.out.println(combine("Hello ", "World"));
    }
}
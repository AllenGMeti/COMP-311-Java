/*
*Allen G Meti
*24019726
*Lab 6 Question 6
*/

public class Calculator {

    private int callCount = 0;

    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method
    public int multiply(int a, int b) {
        callCount++;
        return a * b;
    }

    public static void main(String[] args) {

        // Calling static method
        System.out.println(add(2, 3));

        // Calling instance method
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(4, 5));
    }
}
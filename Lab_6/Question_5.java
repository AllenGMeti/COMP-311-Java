/*
*Allen G Meti
*24019726
*Lab 6 Question 5
*/

public class Question_5 {

    // Method with name only
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Method with name and age
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Call both methods
        displayInfo("Allen");
        displayInfo("Allen", 20);
    }
}
/*
*Allen G Meti
*24019726
*Lab 6 Question 3
*/

public class Question_3 {

    // Void method 
    public static void printBanner() {
        System.out.println("==== WELCOME ====");
    }

    // Method that returns a value
    public static String getBanner() {
        return "==== WELCOME ====";
    }

    public static void main(String[] args) {

        // Call void method
        printBanner();

        // Call returning method
        String banner = getBanner();
        System.out.println(banner);
    }
}
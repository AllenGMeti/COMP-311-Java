/*Allen G Meti
*24019726
*Lab 10 Question 4
*/

public class Question_4 {

    //Method that throws an exception if the age is negative
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age set to " + age);
    }

    public static void main(String[] args) {

        //A valid age
        setAge(20);

        //An invalid age, caught so the program doesn't crash
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

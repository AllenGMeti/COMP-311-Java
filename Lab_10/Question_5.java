/*Allen G Meti
*24019726
*Lab 10 Question 5
*/

public class Question_5 {

    //setAge now throws the custom InvalidAgeException, so it has to be declared with throws
    public static void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        System.out.println("Age set to " + age);
    }

    public static void main(String[] args) {

        //Checked exceptions must be handled, so both calls go inside try/catch
        try {
            setAge(20);
            setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

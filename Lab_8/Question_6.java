/*Allen G Meti
*24019726
*Lab 8 Question 6
*/

public class Question_6 {
    public static void main(String[] args) {

        //Math.random() gives a number from 0.0 up to (but not including) 1.0
        //Multiplying by 6 and adding 1 gives a whole number from 1 to 6
        int roll = (int) (Math.random() * 6) + 1;

        System.out.println("You rolled a " + roll);
    }
}

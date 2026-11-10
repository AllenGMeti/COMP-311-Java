/*Allen G Meti
*24019726
*Lab 9 Question 7
*/

public class Question_7 {
    public static void main(String[] args) {

        //Vehicle references pointing to a Car object and a Motorbike object
        Vehicle vehicle1 = new Car(120, 4);
        Vehicle vehicle2 = new Motorbike(180, 600);

        //The real object decides which version of describe() runs
        vehicle1.describe();
        vehicle2.describe();
    }
}

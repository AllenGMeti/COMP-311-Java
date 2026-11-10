/*Allen G Meti
*24019726
*Lab 9 Question 6
*/

public class Question_6 {
    public static void main(String[] args) {

        //Creating an array of Vehicle holding a mix of Car and Motorbike objects
        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Car(120, 4);
        vehicles[1] = new Motorbike(180, 600);
        vehicles[2] = new Car(100, 2);
        vehicles[3] = new Motorbike(150, 250);

        //Looping through the array calling describe() on each one
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].describe();
        }
    }
}

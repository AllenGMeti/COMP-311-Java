/*Allen G Meti
*24019726
*Lab 9 Question 8
*/

public class Question_8 {
    public static void main(String[] args) {

        //The array of Vehicle objects from Question 6
        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Car(120, 4);
        vehicles[1] = new Motorbike(180, 600);
        vehicles[2] = new Car(100, 2);
        vehicles[3] = new Motorbike(150, 250);

        //Using instanceof to print a different message for each type
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Car) {
                System.out.println("Vehicle " + i + " is a Car");
            } else if (vehicles[i] instanceof Motorbike) {
                System.out.println("Vehicle " + i + " is a Motorbike");
            }
        }
    }
}

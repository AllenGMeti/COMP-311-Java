/*Allen G Meti
*24019726
*Lab 9 Question 9
*/

public class Question_9 {
    public static void main(String[] args) {

        //Array holding one of each subclass
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(120, 4);
        vehicles[1] = new Motorbike(180, 600);
        vehicles[2] = new Truck(90, 12.5);

        //Calling describe() on all three, each one runs its own version
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].describe();
        }
    }
}

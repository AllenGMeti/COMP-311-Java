/*Allen G Meti
*24019726
*Lab 9 Question 1
*/

public class Question_1 {
    public static void main(String[] args) {

        //Creating a Vehicle and a Car (Car extends Vehicle)
        Vehicle vehicle = new Vehicle(80);
        Car car = new Car(120, 4);

        //Calling describe() on both
        vehicle.describe();
        car.describe();
    }
}

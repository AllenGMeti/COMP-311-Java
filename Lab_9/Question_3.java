/*Allen G Meti
*24019726
*Lab 9 Question 3
*/

public class Question_3 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(60);
        Car car = new Car(140, 4);

        //Vehicle runs its own describe(), Car runs the overridden describe()
        vehicle.describe();
        car.describe();
    }
}

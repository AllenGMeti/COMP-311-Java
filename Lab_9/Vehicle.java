/*Allen G Meti
*24019726
*Lab 9 Question 1,2,4
*/

public class Vehicle {

    //protected so that subclasses can use speed directly
    protected int speed;

    //Constructor that sets the speed
    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void describe() {
        System.out.println("This is a vehicle travelling at " + speed + " km/h");
    }
}

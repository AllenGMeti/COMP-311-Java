/*Allen G Meti
*24019726
*Lab 9 Question 9
*/

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(int speed, double loadCapacity) {
        super(speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void describe() {
        System.out.println("This is a truck that can carry " + loadCapacity + " tonnes travelling at " + speed + " km/h");
    }
}

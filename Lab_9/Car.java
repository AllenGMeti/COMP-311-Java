/*Allen G Meti
*24019726
*Lab 9 Question 1,2,3,4,5
*/

public class Car extends Vehicle {

    private int numberOfDoors;

    //Calling the Vehicle constructor with super before setting numberOfDoors
    public Car(int speed, int numberOfDoors) {
        super(speed);
        this.numberOfDoors = numberOfDoors;
    }

    //Overriding describe() with something specific to cars
    @Override
    public void describe() {
        System.out.println("This is a car with " + numberOfDoors + " doors travelling at " + speed + " km/h");
    }

    //Using the protected speed field directly from the subclass
    public void showSpeed() {
        System.out.println("The car's speed is " + speed + " km/h");
    }

    //Overriding toString() so a Car can be printed directly
    @Override
    public String toString() {
        return "Car [speed = " + speed + " km/h, doors = " + numberOfDoors + "]";
    }
}

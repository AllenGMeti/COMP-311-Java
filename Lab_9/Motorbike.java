/*Allen G Meti
*24019726
*Lab 9 Question 6
*/

public class Motorbike extends Vehicle {

    private int engineSize;

    public Motorbike(int speed, int engineSize) {
        super(speed);
        this.engineSize = engineSize;
    }

    @Override
    public void describe() {
        System.out.println("This is a motorbike with a " + engineSize + "cc engine travelling at " + speed + " km/h");
    }
}

/*Allen G Meti
*24019726
*Lab 8 Question 8
*/

public class Question_8 {

    //Method that calculates the area of a circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    //Overloaded method that calculates the area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        //Calling both versions of area
        System.out.println("Area of circle (radius 5): " + area(5));
        System.out.println("Area of rectangle (4 x 6): " + area(4, 6));
    }
}

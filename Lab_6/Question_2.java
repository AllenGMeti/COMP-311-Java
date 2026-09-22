/*
*Allen G Meti
*24019726
*Lab 6 Question 2
*/

public class Question_2 {
    //Creating circleArea method
    public static void circleArea(double radius){
        double area = 3.142 * radius * radius;
        System.out.println("Area = " + area);
    }

    public static void main(String[]args){

        // Calling the circleArea method
        circleArea(1.0);
        circleArea(10.0);
    }
}
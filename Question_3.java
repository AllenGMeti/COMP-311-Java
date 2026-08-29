/*
*Allen G Meti
*24019726
*Lab 1 Question 3 
*/

import java.util.Scanner;

public class Question_3 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter your name: ");
 String name = sc.nextLine();

 System.out.print("Enter your age: ");
 int age = sc.nextInt();

 System.out.println("Hello " + name + "! In five years, you will be " + (age + 5));

 sc.close();

 }
}

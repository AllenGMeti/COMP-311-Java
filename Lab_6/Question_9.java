/*
* Allen G Meti
* 24019726
* Lab 6 Question 9
*/

// Parent class
class Parent {

    public void show() {
        System.out.println("Parent method");
    }

    // Overloaded method
    public void show(int x) {
        System.out.println("Overloaded method: " + x);
    }
}

// Child class
class Child extends Parent {

    // Overridden method
    public void show() {
        System.out.println("Child method");
    }
}

// Main class
public class Question_9 {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.show();
        obj.show(5);
    }
}
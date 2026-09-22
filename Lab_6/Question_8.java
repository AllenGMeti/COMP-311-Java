/*
*Allen G Meti
*24019726
*Lab 6 Question 8
*/

class Animal {

    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {

    // Override method
    public void speak() {
        System.out.println("Meow");
    }
}

public class Question_8 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.speak();

        Cat c = new Cat();
        c.speak();
    }
}
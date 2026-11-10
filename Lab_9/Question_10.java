/*Allen G Meti
*24019726
*Lab 9 Question 10
*/

// Superclass
class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclasses
class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}

// Main class
public class Question_10 {
    public static void main(String[] args) {

        //Array of Animal references holding one of each subclass
        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        //Looping through calling makeSound() on every one
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}

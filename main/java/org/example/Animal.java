package org.example;

public abstract class Animal implements AnimalBehavior {

    String name;
    String color;

    void printInfo() {
        System.out.println("Name: " + name + ", Color: " + color);
    }
}
class Mammal extends Animal {
    public void eat() {
        System.out.println("Mammal eats leaves.");
    }

    public void sleep() {
        System.out.println("Mammal sleeps.");
    }

    public void makeSound() {
        System.out.println("Mammal makes sound.");
    }
}
        class Bird extends Animal{
            public void eat() {
                System.out.println("Bird eats seeds.");
            }

            public void sleep() {
                System.out.println("Bird sleeps.");
            }

            public void makeSound() {
                System.out.println("Bird makes sound.");
            }
        }




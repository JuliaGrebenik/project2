package org.example;

public class Simulation {
    public static void main(String[] args) {

        Bird b=new Bird();
        b.name="Owl";
        b.color="Brown";
        b.printInfo();
        b.eat();
        b.sleep();
        b.makeSound();

        System.out.println();

        Mammal m=new Mammal();
        m.name="Lion";
        m.color="Oeange";
        m.printInfo();
        m.eat();
        m.sleep();
        m.makeSound();

    }
}
